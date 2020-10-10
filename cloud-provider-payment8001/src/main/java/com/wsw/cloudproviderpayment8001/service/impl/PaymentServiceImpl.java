package com.wsw.cloudproviderpayment8001.service.impl;

import com.wsw.cloudproviderpayment8001.dao.PaymentDao;
import com.wsw.cloudproviderpayment8001.entities.Payment;
import com.wsw.cloudproviderpayment8001.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author WangSongWen
 * @Date: Created in 10:50 2020/10/10
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
