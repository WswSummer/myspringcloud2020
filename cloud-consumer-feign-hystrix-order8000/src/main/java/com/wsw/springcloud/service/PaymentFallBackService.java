package com.wsw.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author WangSongWen
 * @Date: Created in 15:52 2020/10/14
 * @Description:
 */
@Component
public class PaymentFallBackService implements PaymentService{

    @Override
    public String get_ok(Long id) {
        return "Global FallBack get_ok";
    }

    @Override
    public String get_timeout(Long id) {
        return "Global FallBack get_timeout";
    }
}
