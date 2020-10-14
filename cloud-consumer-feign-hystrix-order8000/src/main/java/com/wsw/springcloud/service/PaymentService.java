package com.wsw.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author WangSongWen
 * @Date: Created in 11:29 2020/10/14
 * @Description:
 */
@Service
@FeignClient(value = "CLOUD-PAYMENT-HYSTRIX-SERVICE")
public interface PaymentService {
    @GetMapping("/payment/hystrix/get/ok/{id}")
    public String get_ok(@PathVariable("id") Long id);

    @GetMapping("/payment/hystrix/get/timeout/{id}")
    public String get_timeout(@PathVariable("id") Long id);
}
