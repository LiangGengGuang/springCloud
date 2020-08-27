package com.storage.service;

import com.storage.entity.Storage;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author LiangGengguang
 * @create 2020-08-24 15:14
 */

public interface StorageService {

    void decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);

    Storage queryByProductId(@RequestParam("productId") Long productId);
}
