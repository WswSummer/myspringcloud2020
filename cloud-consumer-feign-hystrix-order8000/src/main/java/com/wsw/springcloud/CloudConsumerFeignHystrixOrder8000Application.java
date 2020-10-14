package com.wsw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CloudConsumerFeignHystrixOrder8000Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudConsumerFeignHystrixOrder8000Application.class, args);
	}

}
