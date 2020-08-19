package com.example.nacosConfigClient.action;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiangGengguang
 * @create 2020-08-17 23:22
 */

@RestController
@RefreshScope
public class NacosConfigClient {

    @Value("${config.info}")
    private String profile;

    @GetMapping("/getConfigInfo")
    public String getConfigInfo() {
        return profile;
    }
}
