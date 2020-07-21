package com.example.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import java.net.InetAddress;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

    public static void main(String[] args) throws Exception{
        InetAddress[] allByName = InetAddress.getAllByName("github.com");
        for (InetAddress inetAddress : allByName) {
            System.out.println(inetAddress);
        }

        SpringApplication.run(ConfigServerApplication.class, args);
    }

}
