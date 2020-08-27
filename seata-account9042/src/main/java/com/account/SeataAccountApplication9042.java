package com.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author LiangGengguang
 * @create 2020-08-24 15:03
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.account.dao")
public class SeataAccountApplication9042 {

    public static void main(String[] args) {
        SpringApplication.run(SeataAccountApplication9042.class);
    }
}
