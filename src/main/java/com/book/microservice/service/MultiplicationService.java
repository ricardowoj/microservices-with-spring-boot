package com.book.microservice.service;

import com.book.microservice.domain.Multiplication;
import com.book.microservice.domain.MultiplicationResultAttempt;

public interface MultiplicationService {
    Multiplication createRandomMultiplication();
    boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);
}
