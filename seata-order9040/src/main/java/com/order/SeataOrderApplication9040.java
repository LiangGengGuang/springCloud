package com.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author LiangGengguang
 * @create 2020-08-24 15:04
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@MapperScan("com.order.dao")
public class SeataOrderApplication9040 {

    public static void main(String[] args) {
        SpringApplication.run(SeataOrderApplication9040.class);
    }
}
