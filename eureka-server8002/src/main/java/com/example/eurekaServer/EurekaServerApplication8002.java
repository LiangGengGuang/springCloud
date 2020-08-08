package com.example.eurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author LiangGengguang
 * @create 2020-08-08 22:00
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication8002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication8002.class);
    }


}
