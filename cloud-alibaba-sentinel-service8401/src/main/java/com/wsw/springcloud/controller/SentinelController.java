package com.wsw.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Author WangSongWen
 * @Date: Created in 16:36 2020/10/22
 * @Description:
 */
@RestController
@Slf4j
public class SentinelController {
    @GetMapping("/testA")
    public String testA(){
        return "---testA---";
    }

    @GetMapping("/testB")
    public String testB(){
        return "---testB---";
    }

    @GetMapping("/testC")
    public String testC(){
        /*try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        int i = 1 / 0;
        log.info("---testC---");
        return "---testC---";
    }
}
