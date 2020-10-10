package com.wsw.cloudproviderpayment8001.service;

import com.wsw.cloudproviderpayment8001.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author WangSongWen
 * @Date: Created in 10:49 2020/10/10
 * @Description:
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
