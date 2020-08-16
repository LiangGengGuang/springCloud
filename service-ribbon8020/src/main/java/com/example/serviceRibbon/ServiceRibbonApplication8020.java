package com.example.serviceRibbon;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
@EnableCircuitBreaker
//自定义替换负载均衡算法 不能与@ComponentScan同一包下(@SpringBootApplication内置了该注解)
//@RibbonClient(name = "service-client", configuration = MyRule.class)
public class ServiceRibbonApplication8020 {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRibbonApplication8020.class, args);
    }

    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
