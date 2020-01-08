package com.k.s.cloud.producer.b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudProducerApplicationB {

    public static void main(String[] args) {
        SpringApplication.run(CloudProducerApplicationB.class, args);
    }
}
