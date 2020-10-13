package com.wsw.springcloud.service;

import com.wsw.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author WangSongWen
 * @Date: Created in 10:49 2020/10/10
 * @Description: 服务提供者-提供的服务接口
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
