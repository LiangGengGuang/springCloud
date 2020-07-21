package com.example.sericefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author LiangGengguang
 * @create 2020-01-20 17:54
 */
//通过@ FeignClient（“服务名”），来指定调用哪个服务
@FeignClient(value = "eureka-client",fallback = ErrorFeignClientService.class)
@Component
public interface FeignClientService {

    @RequestMapping(value = "/client", method = RequestMethod.GET)
    String fromFeignClient(@RequestParam(value = "name") String name);
}

