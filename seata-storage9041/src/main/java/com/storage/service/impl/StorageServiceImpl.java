package com.storage.service.impl;

import com.storage.dao.StorageMapper;
import com.storage.entity.Storage;
import com.storage.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LiangGengguang
 * @create 2020-08-26 11:38
 */

@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Autowired
    StorageMapper storageMapper;

    @Override
    public void decrease(Long productId, Integer count) {

        log.info("=======更新库存");
        Storage storage = this.queryByProductId(productId);
        this.storageMapper.lambdaUpdateChainWrapper()
                .set(Storage::getResidue, storage.getResidue() - count)
                .set(Storage::getUsed, storage.getUsed() + count)
                .eq(Storage::getProductId, productId).update();
    }

    @Override
    public Storage queryByProductId(Long productId) {

        return this.storageMapper.lambdaQueryChainWrapper()
                .eq(Storage::getProductId, productId)
                .one();
    }
}
