package com.example.serviceribbon.action;

import com.example.serviceribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiangGengguang
 * @create 2020-01-20 16:04
 */

@RestController
public class RibbonAction {

    @Autowired
    RibbonService ribbonService;

    @RequestMapping(value = "/action")
    public String action(@RequestParam String name) {
        return ribbonService.service(name);
    }
}
