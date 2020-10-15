package com.wsw.springcloud.controller;

import com.wsw.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author WangSongWen
 * @Date: Created in 11:04 2020/10/14
 * @Description:
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment/hystrix/get/ok/{id}")
    public String get_ok(@PathVariable("id") Long id){
        String s = paymentService.payment_ok(id);
        log.info(s);
        return s;
    }

    @GetMapping("/payment/hystrix/get/timeout/{id}")
    public String get_timeout(@PathVariable("id") Long id){
        String s = paymentService.payment_timeout(id);
        log.info(s);
        return s;
    }

    @GetMapping("/payment/hystrix/get/breaker/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        String s = paymentService.paymentCircuitBreaker(id);
        log.info(s);
        return s;
    }
}
