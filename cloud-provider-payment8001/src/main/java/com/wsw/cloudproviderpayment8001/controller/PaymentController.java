package com.wsw.cloudproviderpayment8001.controller;

import com.wsw.cloudproviderpayment8001.entities.CommonResult;
import com.wsw.cloudproviderpayment8001.entities.Payment;
import com.wsw.cloudproviderpayment8001.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author WangSongWen
 * @Date 2020/10/10 下午11:08
 * @Description:
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("插入结果: " + result);

        if (result > 0){
            return new CommonResult(200, "插入数据库成功", result);
        }else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果: " + payment);

        if (null != payment){
            return new CommonResult(200, "查询数据成功", payment);
        }else {
            return new CommonResult(444, "查询数据失败, id = " + id, null);
        }
    }
}
