package com.example.sericefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author LiangGengguang
 * @create 2020-01-23 11:37
 */
@Component
public class ErrorFeignClientService implements FeignClientService {

    @Override
    public String fromFeignClient(String name) {
        return "sorry " + name + "，this is error！";
    }
}
