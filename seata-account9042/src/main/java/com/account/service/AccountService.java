package com.account.service;

import com.account.entity.Account;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author LiangGengguang
 * @create 2020-08-24 15:14
 */
public interface AccountService {

    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);

    Account queryByUserId(@RequestParam("userId") Long userId);
}
