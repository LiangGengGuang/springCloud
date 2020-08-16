package com.example.serviceRibbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author LiangGengguang
 * @create 2020-01-20 16:02
 */

@Service
@DefaultProperties(defaultFallback = "globalError")
public class RibbonService {

    @Resource
    private RestTemplate restTemplate;

    private static final String CLIENT_SERVICE = "http://service-client";

    @HystrixCommand(fallbackMethod = "error", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")//可等待相应时间
    })
    public String getObjectService(String name) {
        return restTemplate.getForObject(CLIENT_SERVICE + "/getCilentInfo?name=" + name, String.class);
    }

    @HystrixCommand
    public String postObjectService(String name) {
        return restTemplate.postForObject(CLIENT_SERVICE + "/postCilentInfo", name, String.class);
    }


    private String error(String name) {
        return "sorry " + name + "，this is error！";
    }

    //全局fallback
    private String globalError() {
        return "sorry this is global error！";
    }


}