package com.wsw.springcloud.dao;

import com.wsw.springcloud.entities.Payment;
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
