package com.wsw.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wsw.springcloud.entities.CommonResult;

/**
 * @Author WangSongWen
 * @Date: Created in 13:49 2020/10/26
 * @Description:
 */
public class GlobalHandler {
    public static CommonResult handler1(BlockException exception){
        return new CommonResult(4444, "自定义globalHandler-----1");
    }

    public static CommonResult handler2(BlockException exception){
        return new CommonResult(4444, "自定义globalHandler-----2");
    }
}
