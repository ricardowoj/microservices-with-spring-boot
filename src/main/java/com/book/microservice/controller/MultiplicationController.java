package com.book.microservice.controller;

import com.book.microservice.domain.Multiplication;
import com.book.microservice.service.MultiplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/multiplications")
public class MultiplicationController {
    
    private final MultiplicationService multiplicationService;
    
    @Autowired
    public MultiplicationController(final MultiplicationService multiplicationService) {
        this.multiplicationService = multiplicationService;
    }
    
    @GetMapping("/random")
    Multiplication getRandomMultiplication() {
        return multiplicationService.createRandomMultiplication();
    }
}
