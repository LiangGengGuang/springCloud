package com.example.myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LiangGengguang
 * @create 2020-08-13 12:24
 */
@Configuration
public class MyRule {

    /**
     * 默认为轮询
     * 更改为随机算法
     *
     * @return
     */
    @Bean
    public IRule randomRule() {

        return new RandomRule();
    }
}
