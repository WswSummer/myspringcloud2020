package com.wsw.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wsw.springcloud.entities.CommonResult;
import com.wsw.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author WangSongWen
 * @Date: Created in 13:21 2020/10/26
 * @Description:
 */
@RestController
public class ResourceLimitController {
    @GetMapping("/resource/limit")
    @SentinelResource(value = "resourceLimit", blockHandler = "deal_resourceLimit")
    public CommonResult resourceLimit(){
        return new CommonResult(200, "按资源名称限流测试OK", new Payment(1L, "wsw"));
    }

    public CommonResult deal_resourceLimit(BlockException exception){
        return new CommonResult(444, exception.getClass().getCanonicalName() + "\t 服务不可用");
    }

    @GetMapping("/url/limit")
    @SentinelResource(value = "resourceLimit")
    public CommonResult urlLimit(){
        return new CommonResult(200, "按url限流测试OK", new Payment(2L, "www"));
    }
}
