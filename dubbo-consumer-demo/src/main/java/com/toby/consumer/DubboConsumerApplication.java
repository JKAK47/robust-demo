package com.toby.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboConsumerApplication {

    public static void main(String[] args) {
        System.out.println("-----------print---------------");
        SpringApplication.run(DubboConsumerApplication.class, args);
        System.out.println("-----------print---------------");
    }

}
