package com.order.controller;

import com.order.entity.CommonResult;
import com.order.entity.Order;
import com.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiangGengguang
 * @create 2020-08-24 15:14
 */

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/queryById")
    public CommonResult queryById(Long orderId) {
        return new CommonResult(200, "订单查询成功", this.orderService.queryById(orderId));
    }

    @GetMapping("/create")
    public CommonResult create(Order order) {
        this.orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
