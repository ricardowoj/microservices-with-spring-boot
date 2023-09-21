package com.book.microservice.domain;

import com.book.microservice.service.MultiplicationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomBeanConfig {
    
    @Bean
    public MultiplicationService getMultiplicationService() {
        return new MultiplicationService() {
            @Override
            public Multiplication createRandomMultiplication() {
                return new Multiplication();
            }
        };
    }
}
