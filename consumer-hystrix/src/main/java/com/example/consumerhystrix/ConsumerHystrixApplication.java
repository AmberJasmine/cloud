package com.example.consumerhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
@SpringCloudApplication
//@EnableHystrix
public class ConsumerHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixApplication.class, args);
    }

}
