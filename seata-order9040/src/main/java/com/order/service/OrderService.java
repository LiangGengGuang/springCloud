package com.order.service;

import com.order.entity.Order;

/**
 * @author LiangGengguang
 * @create 2020-08-26 15:56
 */
public interface OrderService {

    Order queryById(Long orderId);

    void create(Order order);

    void updateStatus(Long userId);
}
