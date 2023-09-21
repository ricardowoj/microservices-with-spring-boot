package com.book.microservice.service;

import com.book.microservice.domain.Multiplication;
import com.book.microservice.domain.MultiplicationResultAttempt;
import org.springframework.stereotype.Service;

@Service
public class MultiplicationServiceImpl implements MultiplicationService {
    
    private final RandomGeneratorService randomGeneratorService;

    public MultiplicationServiceImpl(final RandomGeneratorService randomGeneratorService) {
        this.randomGeneratorService = randomGeneratorService;
    }

    @Override
    public Multiplication createRandomMultiplication() {
        int factorA = randomGeneratorService.generateRandomFactor();
        int factorB = randomGeneratorService.generateRandomFactor();
        return new Multiplication(factorA, factorB);
    }

    @Override
    public boolean checkAttempt(final MultiplicationResultAttempt resultAttempt) {
        return resultAttempt.getResultAttempt() ==
                resultAttempt.getMultiplication().getFactorA() * 
                resultAttempt.getMultiplication().getFactorB();
    }
}
