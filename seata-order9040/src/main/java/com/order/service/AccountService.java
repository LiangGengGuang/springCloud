package com.order.service;

import com.order.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author LiangGengguang
 * @create 2020-08-24 15:14
 */

@FeignClient(value = "seata-account")
public interface AccountService {

    /**
     * 减余额
     *
     * @param userId
     * @param money
     * @return
     */
    @RequestMapping("/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}