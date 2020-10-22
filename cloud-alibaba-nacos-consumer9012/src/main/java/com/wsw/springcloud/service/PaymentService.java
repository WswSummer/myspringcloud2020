package com.wsw.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author WangSongWen
 * @Date: Created in 9:37 2020/10/22
 * @Description:
 */
@Service
@FeignClient(value = "nacos-payment-provider")
public interface PaymentService {
    @GetMapping("/nacos/payment/{id}")
    public String test(@PathVariable("id") String id);
}
