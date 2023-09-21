package com.book.microservice.service;

import com.book.microservice.domain.Multiplication;

public class MultiplicationServiceImpl implements MultiplicationService {
    
    @Override
    public Multiplication createRandomMultiplication() {
        int factorA = createRandomMultiplication().getFactorA();
        int factorB = createRandomMultiplication().getFactorB();
        return new Multiplication(factorA, factorB);
    }
}
