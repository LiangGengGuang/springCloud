package com.example.serviceRibbon.action;

import com.example.serviceRibbon.service.RibbonService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author LiangGengguang
 * @create 2020-01-20 16:04
 */

@RestController
public class RibbonAction {

    @Autowired
    RibbonService ribbonService;

    /*
     * 服务降级
     */
    @GetMapping(value = "/getObjectAction")
    public String getObjectAction(@RequestParam String name) {
        return ribbonService.getObjectService(name);
    }

    @PostMapping(value = "/postObjectAction")
    public String postObjectAction(@RequestParam String name) {
        return ribbonService.postObjectService(name);
    }

    /*
     * 服务熔断
     */
    @GetMapping("/circuitBreaker")
    @HystrixCommand(fallbackMethod = "circuitBreakerError", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),//是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "3"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),//失败率达到多少后跳闸
    })
    public String circuitBreaker(@RequestParam Integer id) {
        if (id < 0) {
            throw new RuntimeException("id不能为负数");
        }
        return "success 流水号：" + UUID.randomUUID().toString();
    }

    private String circuitBreakerError(Integer id) {
        return "id为：" + id + "不能为负数";
    }
}
