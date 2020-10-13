package com.wsw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CloudConsumerFeignOrder8000Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudConsumerFeignOrder8000Application.class, args);
	}

}
