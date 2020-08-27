package com.account.entity;

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
@TableName(value = "t_account")
public class Account {

    private Long id;
    private Long userId;
    private BigDecimal total;
    private BigDecimal used;
    private BigDecimal residue;
}
