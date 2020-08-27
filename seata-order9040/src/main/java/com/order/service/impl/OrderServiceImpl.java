package com.order.service.impl;

import com.order.dao.OrderMapper;
import com.order.entity.Order;
import com.order.service.AccountService;
import com.order.service.OrderService;
import com.order.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LiangGengguang
 * @create 2020-08-26 10:51
 */

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private StorageService storageService;
    @Autowired
    private AccountService accountService;

    @Override
    public Order queryById(Long orderId) {
        return this.orderMapper.selectById(orderId);
    }

    @Override
    @GlobalTransactional(name = "seata-create-order", rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("=======创建订单");
        this.orderMapper.insert(order);

        log.info("=======微服务调用库存");
        this.storageService.decrease(order.getProductId(), order.getCount());

        log.info("=======微服务调用账户");
        this.accountService.decrease(order.getUserId(), order.getMoney());

        log.info("=======修改订单状态");
        this.updateStatus(order.getUserId());

        log.info("=======创建订单完成");
    }

    @Override
    public void updateStatus(Long userId) {
        this.orderMapper.lambdaUpdateChainWrapper()
                .set(Order::getStatus, 1)
                .eq(Order::getUserId, userId)
                .update();
    }
}
