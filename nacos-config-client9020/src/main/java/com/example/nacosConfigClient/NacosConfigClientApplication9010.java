package com.example.nacosConfigClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author LiangGengguang
 * @create 2020-08-17 22:59
 */

@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientApplication9010 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientApplication9010.class);
    }
}
