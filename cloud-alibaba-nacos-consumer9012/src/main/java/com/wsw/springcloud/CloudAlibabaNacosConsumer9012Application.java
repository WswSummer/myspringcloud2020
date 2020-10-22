package com.wsw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudAlibabaNacosConsumer9012Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudAlibabaNacosConsumer9012Application.class, args);
	}

}
