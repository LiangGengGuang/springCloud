package com.example.nacosProvider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author LiangGengguang
 * @create 2020-08-17 21:46
 */

@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderApplication9002 {

    public static void main(String[] args) {
        SpringApplication.run(NacosProviderApplication9002.class);
    }
}
