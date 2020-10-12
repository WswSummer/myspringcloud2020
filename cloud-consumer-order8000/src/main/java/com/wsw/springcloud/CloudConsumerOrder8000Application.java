package com.wsw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudConsumerOrder8000Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrder8000Application.class, args);
    }

}
