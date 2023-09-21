package com.book.microservice.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public final class Multiplication {
    private final int factorA;
    private final int factorB;
    private final int result;

    public Multiplication(int factorA, int factorB) {
        this.factorA = factorA;
        this.factorB = factorB;
        this.result = factorA * factorB;
    }

    Multiplication() {
        this(0, 0);
    }
}
