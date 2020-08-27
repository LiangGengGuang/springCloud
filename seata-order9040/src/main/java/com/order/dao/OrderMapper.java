package com.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.order.entity.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author LiangGengguang
 * @create 2020-08-24 15:35
 */

@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    default LambdaUpdateChainWrapper<Order> lambdaUpdateChainWrapper() {
        return new LambdaUpdateChainWrapper<>(this);
    }

    default LambdaQueryChainWrapper<Order> lambdaQueryChainWrapper() {
        return new LambdaQueryChainWrapper<>(this);
    }
}
