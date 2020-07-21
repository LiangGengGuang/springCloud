package com.example.sericefeign.action;

import com.example.sericefeign.service.FeignClientService;
import com.example.sericefeign.service.FeignClientService02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiangGengguang
 * @create 2020-01-20 17:57
 */

@RestController
public class FeignClientAction {

    @Autowired
    FeignClientService feignClientService;
    @Autowired
    FeignClientService02 feignClientService02;

    @RequestMapping(value = "/action", method = RequestMethod.GET)
    public String action(@RequestParam String name) {
        return feignClientService.fromFeignClient(name);
    }

    @RequestMapping(value = "/action02", method = RequestMethod.GET)
    public String action02(@RequestParam String name) {
        return feignClientService02.fromFeignClient(name);
    }
}
