package com.example.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author LiangGengguang
 * @create 2020-01-20 16:02
 */

@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorService")
    public String service(String name) {
        return restTemplate.getForObject("http://eureka-client/client?name=" + name, String.class);
    }

    public String errorService(String name) {
        return "sorry " + name + "，this is error！";
    }
}