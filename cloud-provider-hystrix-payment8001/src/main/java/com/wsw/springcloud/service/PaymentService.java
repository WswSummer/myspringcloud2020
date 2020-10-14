package com.wsw.springcloud.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.concurrent.TimeUnit;

/**
 * @Author WangSongWen
 * @Date: Created in 10:26 2020/10/14
 * @Description:
 */
@Service
public class PaymentService {

    public String payment_ok(Long id){
        return "线程池: " + Thread.currentThread().getName() + " payment_ok id: " + id;
    }

    public String payment_timeout(Long id){
        int timeCount = 3;
        try {
            TimeUnit.SECONDS.sleep(timeCount);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池: " + Thread.currentThread().getName() + " payment_timeout id: " + id + " 耗时(秒): " + timeCount;
    }
}
