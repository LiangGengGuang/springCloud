package com.example.serviceClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceClientApplication8011 {

    public static void main(String[] args) {
        SpringApplication.run(ServiceClientApplication8011.class, args);
    }

}
