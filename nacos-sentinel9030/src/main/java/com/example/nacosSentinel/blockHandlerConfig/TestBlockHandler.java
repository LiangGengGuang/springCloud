package com.example.nacosSentinel.blockHandlerConfig;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * 解耦兜底blockHandlerClass异常,方法必须带static
 *
 * @author LiangGengguang
 * @create 2020-08-21 14:28
 */
public class TestBlockHandler {

    public static String testABlockHander(BlockException e) {

        return "testABlockHander:请求过于频繁，请稍后再试" + e.getMessage();
    }

    public static String testBBlockHander(BlockException e) {

        return "testBBlockHander:请求过于频繁，请稍后再试" + e.getMessage();
    }

    public static String testDBlockHander(String v1, String v2, BlockException e) {

        return "testDBlockHander:请求过于频繁，请稍后再试" + e.getMessage();
    }
}
