package com.example.serviceClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class ServiceClientApplication8010 {

    public static void main(String[] args) {
        SpringApplication.run(ServiceClientApplication8010.class, args);
    }

    @Value("${server.port}")
    String port;

    @GetMapping("/getCilentInfo")
    public String getCilentInfo(@RequestParam String name) {
        return "GET: hello " + name + "，i am from port:" + port;
    }

    @PostMapping("/postCilentInfo")
    public String postCilentInfo(@RequestBody String name) {
        return "POST: hello " + name + "，i am from port:" + port;
    }
}
