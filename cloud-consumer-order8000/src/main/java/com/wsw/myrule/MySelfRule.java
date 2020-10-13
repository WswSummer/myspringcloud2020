package com.wsw.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author WangSongWen
 * @Date: Created in 14:40 2020/10/13
 * @Description: 负载均衡算法设置
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();  // 自定义负载均衡算法为随机
    }
}
