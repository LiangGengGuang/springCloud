package com.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LiangGengguang
 * @create 2020-08-26 16:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer id;
    private String context;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
