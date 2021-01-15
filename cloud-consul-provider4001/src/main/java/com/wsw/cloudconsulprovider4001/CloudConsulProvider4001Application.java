package com.wsw.cloudconsulprovider4001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsulProvider4001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsulProvider4001Application.class, args);
    }

}
