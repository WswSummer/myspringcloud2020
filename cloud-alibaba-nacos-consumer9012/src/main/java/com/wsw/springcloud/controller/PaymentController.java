package com.wsw.springcloud.controller;

import com.wsw.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author WangSongWen
 * @Date: Created in 9:39 2020/10/22
 * @Description:
 */
@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/consumer/nacos/payment/{id}")
    public String test(@PathVariable("id") String id){
        return paymentService.test(id);
    }
}
