package com.techm.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestCalculator {
static Calculator calc;

    @BeforeAll
	public static void setUp()
	{
		calc = new Calculator();
	}
	
	@Test
	@DisplayName("testing sum method")
	void testSum() {

		
		int result = calc.sum(4, 5);
		assertEquals(9, result);
		
	}
	
	@Test
	@DisplayName("testing mul method")
	void testMul()
	{
		
		int result = calc.mul(4, 5);
		assertEquals(20, result);
	}
	
	@AfterAll
	public static void tearDown()
	{
		calc = null;
	}

}
