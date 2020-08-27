package com.storage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author LiangGengguang
 * @create 2020-08-24 15:05
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.storage.dao")
public class SeataStorageApplication9041 {

    public static void main(String[] args) {
        SpringApplication.run(SeataStorageApplication9041.class);
    }
}
