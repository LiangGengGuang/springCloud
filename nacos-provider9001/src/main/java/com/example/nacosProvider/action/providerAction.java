package com.example.nacosProvider.action;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiangGengguang
 * @create 2020-08-17 21:56
 */

@RestController
public class providerAction {

    @Value("${server.port}")
    private String port;

    @GetMapping("/action")
    public String action(String name) {
        return name + "welcome to nacos-provider:" + port + " !!!";
    }
}
