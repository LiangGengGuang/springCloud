package com.example.nacosSentinel.fallbackConfig;

/**
 * 解耦兜底fallbackClass异常,方法必须带static
 *
 * @author LiangGengguang
 * @create 2020-08-21 14:50
 */
public class TestFallBack {

    //Java规则异常兜底
    public static String error(Throwable e) {
        return "error:限流请求连接(Java类异常)的兜底方法：" + e.getMessage();
    }

    public static String defaultError(Throwable e) {
        return "defaultError:限流请求连接(Java类异常)的兜底方法：" + e.getMessage();
    }
}
