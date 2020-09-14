package com.account.service.impl;

import com.account.dao.AccountMapper;
import com.account.entity.Account;
import com.account.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author LiangGengguang
 * @create 2020-08-26 11:40
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public void decrease(Long userId, BigDecimal money) {

//        try {
//            TimeUnit.SECONDS.sleep(20);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        log.info("=======更新账户信息");
        Account account = this.queryByUserId(userId);
        this.accountMapper.lambdaUpdateChainWrapper()
                .set(Account::getResidue, account.getResidue().subtract(money))
                .set(Account::getUsed, account.getUsed().add(money))
                .eq(Account::getUserId, userId).update();
        log.info("=======账户余额扣减成功");
    }

    @Override
    public Account queryByUserId(Long userId) {

        return this.accountMapper.lambdaQueryChainWrapper()
                .eq(Account::getUserId, userId)
                .one();
    }
}
