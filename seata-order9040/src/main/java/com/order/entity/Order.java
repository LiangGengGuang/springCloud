package com.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author LiangGengguang
 * @create 2020-08-24 15:13
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_order")
public class Order {

    private Long id;
    private Long userId;
    private Long productId;
    private Integer count;
    private BigDecimal money;
    private Integer status;
}
