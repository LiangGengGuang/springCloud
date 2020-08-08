package com.example.serviceClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class ServiceClientApplication8010 {

    public static void main(String[] args) {
        SpringApplication.run(ServiceClientApplication8010.class, args);
    }

    @Value("${server.port}")
    String port;

    @GetMapping("/client")
    public String home(@RequestParam String name) {
        return "hello " + name + "，i am from port:" + port;
    }

}
