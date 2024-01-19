package com.carlocodes.bank_discovery_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BankDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankDiscoveryServiceApplication.class, args);
    }

}
