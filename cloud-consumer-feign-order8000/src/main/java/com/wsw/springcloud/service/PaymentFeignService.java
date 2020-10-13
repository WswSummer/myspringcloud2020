package com.wsw.springcloud.service;

import com.wsw.springcloud.entities.CommonResult;
import com.wsw.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author WangSongWen
 * @Date: Created in 16:58 2020/10/13
 * @Description: 使用Feign进行服务调用
 */
@Service
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}
