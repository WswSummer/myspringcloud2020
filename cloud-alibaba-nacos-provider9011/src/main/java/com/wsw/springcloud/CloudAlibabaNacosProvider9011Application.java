package com.wsw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaNacosProvider9011Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudAlibabaNacosProvider9011Application.class, args);
	}

}
