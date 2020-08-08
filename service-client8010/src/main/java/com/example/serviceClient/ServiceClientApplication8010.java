package com.example.serviceClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class EurekaClientApplication8010 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication8010.class, args);
    }

    @Value("${server.port}")
    String port;

    @GetMapping("/client")
    public String home(@RequestParam String name) {
        return "hello " + name + "，i am from port:" + port;
    }

}
