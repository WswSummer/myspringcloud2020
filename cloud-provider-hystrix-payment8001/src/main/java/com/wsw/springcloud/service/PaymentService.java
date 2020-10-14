package com.wsw.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author WangSongWen
 * @Date: Created in 10:26 2020/10/14
 * @Description: 使用Hystrix进行服务降级
 */
@Service
public class PaymentService {

    public String payment_ok(Long id){
        return "线程池: " + Thread.currentThread().getName() + " payment_ok id: " + id;
    }

    @HystrixCommand(fallbackMethod = "payment_TimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String payment_timeout(Long id){
        int timeCount = 5;
        try {
            TimeUnit.SECONDS.sleep(timeCount);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池: " + Thread.currentThread().getName() + " payment_timeout id: " + id + " 耗时(秒): " + timeCount;
    }

    public String payment_TimeOutHandler(Long id){
        return "线程池: " + Thread.currentThread().getName() + " 系统繁忙或运行报错,请稍后再试 id: " + id + "\t" + "/(ㄒoㄒ)/~~";
    }
}
