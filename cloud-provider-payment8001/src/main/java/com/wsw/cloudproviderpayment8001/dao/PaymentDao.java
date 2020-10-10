package com.wsw.cloudproviderpayment8001.dao;

import com.wsw.cloudproviderpayment8001.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author WangSongWen
 * @Date: Created in 10:18 2020/10/10
 * @Description:
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);
    
    Payment getPaymentById(@Param("id") Long id);
}
