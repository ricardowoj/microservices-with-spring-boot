package com.book.microservice;

import com.book.microservice.domain.Multiplication;
import com.book.microservice.service.MultiplicationService;
import com.book.microservice.service.RandomGeneratorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultiplicationServiceTests {

	@MockBean
	private RandomGeneratorService randomGeneratorService;
	
	@Autowired
	private MultiplicationService multiplicationService;

	@Test
	public void createRondomMultiplicationTest() {
		given(randomGeneratorService.generateRandomFactor()).willReturn(50, 30);
		Multiplication multiplication = multiplicationService.createRandomMultiplication();
		assertThat(multiplication.getFactorA()).isEqualTo(50);
		assertThat(multiplication.getFactorB()).isEqualTo(30);
		assertThat(multiplication.getResult()).isEqualTo(1500);
	}
}
