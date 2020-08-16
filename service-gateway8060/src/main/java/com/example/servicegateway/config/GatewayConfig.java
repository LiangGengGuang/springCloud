package com.example.servicegateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LiangGengguang
 * @create 2020-08-17 01:37
 */

@Configuration
public class GatewayConfig {
    /**
     * 配置了一个id为route-name的路由规则
     * 当访问地址 http://localhost:8060/guonei时会自动转发到地址： http://news.baidu.com/guonei
     * path是断言相当于在yml中配置
     * predicates:
     * Path=/lady
     *
     * @param builder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("path_route_guonei",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }

    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder builder) {
        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("path_route_guoji",
                r -> r.path("/guoji")
                        .uri("http://news.baidu.com/guoji")).build();
        return routes.build();
    }
}
