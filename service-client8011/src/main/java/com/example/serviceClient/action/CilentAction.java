package com.example.serviceClient.action;

import com.example.serviceClient.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * @author LiangGengguang
 * @create 2020-08-14 14:30
 */
@RestController
public class CilentAction {

    @Autowired
    ClientService clientService;

    @GetMapping("/getCilentInfo")
    public String getCilentInfo(@RequestParam String name) {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return clientService.getCilentInfo(name);
    }

    @PostMapping("/postCilentInfo")
    public String postCilentInfo(@RequestBody String name) {
        int n = 19 / 0;
        return clientService.postCilentInfo(name);
    }
}
