package com.book.microservice.service;

import com.book.microservice.domain.Multiplication;
import com.book.microservice.domain.MultiplicationResultAttempt;
import com.book.microservice.domain.User;
import com.book.microservice.service.MultiplicationServiceImpl;
import com.book.microservice.service.RandomGeneratorService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

public class MultiplicationServiceImplTest {
    
    private MultiplicationServiceImpl multiplicationServiceImpl;
    
    @Mock
    private RandomGeneratorService randomGeneratorService;
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        multiplicationServiceImpl = new MultiplicationServiceImpl(randomGeneratorService);
    }
    
    @Test
    public void createRandomMultiplicationTest() {
        given(randomGeneratorService.generateRandomFactor())
                .willReturn(50, 30);

        Multiplication multiplication = multiplicationServiceImpl.createRandomMultiplication();
        assertThat(multiplication.getFactorA()).isEqualTo(50);
        assertThat(multiplication.getFactorB()).isEqualTo(30);
        assertThat(multiplication.getResult()).isEqualTo(1500);
    }
    
    @Test
    public void checkCorrectAttemptTest() {
        Multiplication multiplication = new Multiplication(50, 60);
        User user = new User("john_doe");
        MultiplicationResultAttempt attempt = new MultiplicationResultAttempt(user, multiplication, 3000, true);
        boolean attemptResult = multiplicationServiceImpl.checkAttempt(attempt);
        assertThat(attemptResult).isTrue();
    }
}
