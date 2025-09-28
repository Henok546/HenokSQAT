package com.quality.project;
import com.quality.project.AdvancedMath;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

public class AdvancedMathTest {
	
	
	@BeforeAll
	public static void welcomeMessage() {
		System.out.println("Welcome to the following unit tests for the Calculator");
	}
	
	@BeforeEach
	public  void initializeCalc() {
		AdvancedMath calc = new AdvancedMath();
	}
	
	
	@Test
	public void multiplyTest() {
		AdvancedMath calc = new AdvancedMath();
		double num1 = 12;
		double num2 = 4;
		double result = calc.multiply(num1, num2);
		assertEquals(48, result);
		
	}
	
	@Test
	public void divideTest() {
		AdvancedMath calc = new AdvancedMath();
		double num1 = 12;
		double num2 = 4;
		double result = calc.divide(num1, num2);
		
		
	}
	
	@Test
	public void logErrorTest() {
		AdvancedMath calc = new AdvancedMath();
		double negative = -100;
		assertThrows(IllegalArgumentException.class, () -> calc.log(negative));
		}
	
	

	@Disabled
	public void factorialTest(){
		AdvancedMath calc = new AdvancedMath();
		double num1 = 32;
	    calc.factorial(num1);
		
	}
	
	
	@AfterEach
	public void eachMessage() {
		
		System.out.println("This unit test has been completed");
	}
	
	
	@AfterAll
	public static void finalMessage() {
		
		System.out.println("All unit test has been completed");
	}
	
	
	

}
