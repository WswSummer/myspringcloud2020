package com.wsw.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author WangSongWen
 * @Date: Created in 16:36 2020/10/22
 * @Description:
 */
@RestController
public class SentinelController {
    @GetMapping("/testA")
    public String testA(){
        return "---testA---";
    }

    @GetMapping("/testB")
    public String testB(){
        return "---testB---";
    }
}
