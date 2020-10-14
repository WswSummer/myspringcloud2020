package com.wsw.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author WangSongWen
 * @Date: Created in 10:26 2020/10/14
 * @Description: 使用Hystrix进行服务降级与服务熔断
 */
@Service
public class PaymentService {

    public String payment_ok(Long id){
        return "线程池: " + Thread.currentThread().getName() + " payment_ok id: " + id;
    }

    // 服务降级
    @HystrixCommand(fallbackMethod = "payment_TimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    public String payment_timeout(Long id){
        int timeCount = 3;
        //int i = 10 / 0;
        try {
            TimeUnit.SECONDS.sleep(timeCount);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池: " + Thread.currentThread().getName() + " payment_timeout id: " + id + " 耗时(秒): " + timeCount;
    }

    public String payment_TimeOutHandler(Long id){
        return "线程池: " + Thread.currentThread().getName() + " 8001系统繁忙或运行报错,请稍后再试 id: " + id + "\t" + "/(ㄒoㄒ)/~~";
    }

    // 服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback", commandProperties = {
            @HystrixProperty(name = "CircuitBreaker.enabled", value = "true"), // 开启断路器
            @HystrixProperty(name = "CircuitBreaker.requestVolumeThreshold", value = "10"), // 请求次数
            @HystrixProperty(name = "CircuitBreaker.sleepWindowInMilliseconds", value = "10000"), // 时间窗口期
            @HystrixProperty(name = "CircuitBreaker.errorThresholdPercentage", value = "60") // 失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(Integer id){
        if (id < 0 ){
            throw new RuntimeException("id不能为负数!");
        }
        String simpleUUID = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "\t" + " 调用成功: " + simpleUUID;
    }

    public String paymentCircuitBreaker_fallback(Integer id){
        return "id不能为负数，请稍后再试/(ㄒoㄒ)/~~, id: " + id;
    }
}
