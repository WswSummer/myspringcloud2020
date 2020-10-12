package com.wsw.cloudconsumerorder8000.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author WangSongWen
 * @Date: Created in 11:05 2020/10/12
 * @Description:
 */
@Configuration
public class OrderConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
