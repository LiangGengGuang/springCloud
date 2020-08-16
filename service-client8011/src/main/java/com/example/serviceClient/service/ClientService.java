package com.example.serviceClient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author LiangGengguang
 * @create 2020-08-14 14:27
 */

@Service
public class ClientService {

    @Value("${server.port}")
    String port;

    public String getCilentInfo(String name) {
        return "GET: hello " + name + "，i am from port:" + port;
    }

    public String postCilentInfo(String name) {
        return "POST: hello " + name + "，i am from port:" + port;
    }
}

