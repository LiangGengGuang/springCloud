package com.example.sericefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Feign声明式的伪Http客户，具有可插拔的注解特性，默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。
 */

@EnableHystrixDashboard
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@EnableHystrix
public class ServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class, args);
    }
}
