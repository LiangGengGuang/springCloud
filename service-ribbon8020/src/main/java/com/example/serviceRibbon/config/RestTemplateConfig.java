package com.example.serviceRibbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author LiangGengguang
 * @create 2020-08-13 14:24
 */

@Configuration
public class RestTemplateConfig {


    /**
     * LoadBalanced表明这个restRemplate开启负载均衡的功能
     *
     * @return RestTemplate();
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {

        return new RestTemplate();
    }
}
