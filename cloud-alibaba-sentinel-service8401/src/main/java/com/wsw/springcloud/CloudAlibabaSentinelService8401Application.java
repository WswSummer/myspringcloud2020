package com.wsw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaSentinelService8401Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudAlibabaSentinelService8401Application.class, args);
	}

}
