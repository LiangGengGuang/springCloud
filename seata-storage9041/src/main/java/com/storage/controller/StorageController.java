package com.storage.controller;

import com.storage.entity.CommonResult;
import com.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiangGengguang
 * @create 2020-08-24 15:14
 */

@RestController
@RequestMapping("storage")
public class StorageController {

    @Autowired
    StorageService storageService;

    @RequestMapping("/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200, "扣减库存成功！");
    }
}
