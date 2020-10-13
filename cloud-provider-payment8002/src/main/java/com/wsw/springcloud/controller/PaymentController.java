package com.wsw.springcloud.controller;

import com.wsw.springcloud.entities.CommonResult;
import com.wsw.springcloud.entities.Payment;
import com.wsw.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
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

    // 服务发现
    @GetMapping("/payment/discovery")
    public Object getDiscovery(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("service: " + service);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVER");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }

        return discoveryClient;
    }
}
