package com.account.dao;

import com.account.entity.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author LiangGengguang
 * @create 2020-08-24 15:35
 */

@Mapper
public interface AccountMapper extends BaseMapper<Account> {

    default LambdaUpdateChainWrapper<Account> lambdaUpdateChainWrapper() {
        return new LambdaUpdateChainWrapper<>(this);
    }

    default LambdaQueryChainWrapper<Account> lambdaQueryChainWrapper() {
        return new LambdaQueryChainWrapper<>(this);
    }
}
