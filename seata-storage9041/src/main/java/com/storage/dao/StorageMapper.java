package com.storage.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.storage.entity.Storage;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author LiangGengguang
 * @create 2020-08-24 15:35
 */

@Mapper
public interface StorageMapper extends BaseMapper<Storage> {

    default LambdaUpdateChainWrapper<Storage> lambdaUpdateChainWrapper() {
        return new LambdaUpdateChainWrapper<>(this);
    }


    default LambdaQueryChainWrapper<Storage> lambdaQueryChainWrapper() {
        return new LambdaQueryChainWrapper<>(this);
    }
}
