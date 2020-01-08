package com.k.s.cloud.producer.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudProducerApplicationA {

    public static void main(String[] args) {
        SpringApplication.run(CloudProducerApplicationA.class, args);
    }
}
