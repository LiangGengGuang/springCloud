package com.storage.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LiangGengguang
 * @create 2020-08-24 15:13
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_storage")
public class Storage {

    private Long id;
    private Long productId;
    private Integer total;
    private Integer used;
    private Integer residue;
}
