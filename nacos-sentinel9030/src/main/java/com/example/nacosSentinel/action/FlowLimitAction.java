package com.example.nacosSentinel.action;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.example.nacosSentinel.blockHandlerConfig.TestBlockHandler;
import com.example.nacosSentinel.fallbackConfig.TestFallBack;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * 在可视化界面配置的限流、降级、热点规则都为临时规则，服务重启对应的规则就消息。@SentinelResource注解不支持private
 *
 * @author LiangGengguang
 * @create 2020-08-19 22:01
 */
@RestController
@Slf4j
public class FlowLimitAction {

    @GetMapping("/testA")
    @SentinelResource(value = "testA", blockHandlerClass = TestBlockHandler.class, blockHandler = "testABlockHander")
    public String testA() {
        return "=====testA=====";
    }

    @GetMapping("/testB")
    @SentinelResource(value = "testB", blockHandlerClass = TestBlockHandler.class, blockHandler = "testBBlockHander")
    public String testB() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(300);
        return "=====testB=====";
    }

    /**
     * fallback的优先级大于defaultFallback
     * 如果 fallback 指定的方法不存在，还会执行 defaultFallback 指定的方法。
     *
     * @return
     */

    @GetMapping("/testC")
    @SentinelResource(value = "testC", blockHandler = "blockHandlerError",
            fallbackClass = TestFallBack.class, fallback = "error", defaultFallback = "defaultError")
    public String testC() {
        int a = 10 / 0;
        return "=====testC=====";
    }

    @GetMapping("/testD")
    @SentinelResource(value = "testD", blockHandlerClass = TestBlockHandler.class, blockHandler = "testDBlockHander")
    public String testD(@RequestParam(value = "v1", required = false) String v1,
                        @RequestParam(value = "v2", required = false) String v2) {
        return "=====testD=====v1：" + v1 + "，v2：" + v2;
    }

    //Sentinel规则异常兜底
    public String blockHandlerError(String v1, String v2, BlockException exception) {
        return "查询过于频繁，请稍后再试";
    }

}
