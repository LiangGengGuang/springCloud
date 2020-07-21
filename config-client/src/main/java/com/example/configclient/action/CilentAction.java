package com.example.configclient.action;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author LiangGengguang
 * @create 2020-02-11 21:41
 */
@RefreshScope
@RestController
public class CilentAction {

    //注解来获取 Server 端参数的值
    @Value("${info.profile:error}")
    private String profile;

    @GetMapping("/info")
    public Mono<String> action() {
        return Mono.justOrEmpty(profile);
    }
}
