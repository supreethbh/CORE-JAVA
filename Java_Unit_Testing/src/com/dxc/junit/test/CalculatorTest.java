package com.dxc.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.dxc.junit.dev.Calculator;

class CalculatorTest {

	static Calculator calculator = null;
	
	int actual = 0;
	
	@BeforeAll
	public static void beforeAll() {
		
		calculator = new Calculator();
	}
	
	@Test
	public void testAddition() {
		
		assertEquals(10, calculator.addition(5, 5));
		
		assertNotEquals(5, calculator.addition(5, 5));
	}

	@Test
	public void testSubtraction() {
	
		assertEquals(0, calculator.subtraction(5, 5));
		
		assertNotEquals(1, calculator.subtraction(5, 5));
	}

	@Test
	public void testMultiplication() {
		
		assertEquals(25, calculator.multiplication(5, 5));
		
		assertNotEquals(20, calculator.multiplication(5, 5));
	}
}
