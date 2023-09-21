package com.book.microservice.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public final class MultiplicationResultAttempt {
    
    private final User user;
    private final Multiplication multiplication;
    private final int resultAttempt;
    
    public MultiplicationResultAttempt() {
        user = null;
        multiplication = null;
        resultAttempt = -1;
    }

    public MultiplicationResultAttempt(User user, Multiplication multiplication, int resultAttempt) {
        this.user = user;
        this.multiplication = multiplication;
        this.resultAttempt = resultAttempt;
    }
}
