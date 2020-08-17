package com.example.servicegateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZonedDateTime;

@SpringBootTest
class ServiceGatewayApplicationTests {

    @Test
    void contextLoads() {

        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);
    }

}
