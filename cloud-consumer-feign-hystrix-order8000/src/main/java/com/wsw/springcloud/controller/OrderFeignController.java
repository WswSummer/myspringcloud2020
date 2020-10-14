package com.wsw.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.wsw.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author WangSongWen
 * @Date: Created in 11:32 2020/10/14
 * @Description:
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderFeignController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/order/payment/hystrix/get/ok/{id}")
    public String get_ok(@PathVariable("id") Long id){
        String s = paymentService.get_ok(id);
        log.info(s);
        return s;
    }

    @GetMapping("/order/payment/hystrix/get/timeout/{id}")
    /*@HystrixCommand(fallbackMethod = "payment_TimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "4000")
    })*/
    @HystrixCommand
    public String get_timeout(@PathVariable("id") Long id){
        //int i = 10 / 0;
        String s = paymentService.get_timeout(id);
        log.info(s);
        return s;
    }

    public String payment_Global_FallbackMethod(){
        return "Global异常处理信息，请稍后再试 /(ㄒoㄒ)/~~";
    }
}
