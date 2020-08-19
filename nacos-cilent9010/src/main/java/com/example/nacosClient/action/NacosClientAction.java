package com.example.nacosClient.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author LiangGengguang
 * @create 2020-08-17 22:20
 */

@RestController
public class NacosClientAction {


    @Autowired
    private RestTemplate restTemplate;

    @Value("${server-url.nacos-user-service}")
    private String uri;
    @Value("${server.port}")
    private String port;


    @GetMapping("/action")
    public String action(String name) {
        return restTemplate.getForObject(uri + "/action?name=" + name, String.class);
    }

}
