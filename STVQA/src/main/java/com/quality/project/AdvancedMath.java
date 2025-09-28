package com.quality.project;

public class AdvancedMath {
	
	public double multiply(double a, double b) {
		return a * b;
		}
	
	public double divide(double a, double b) {
		if (b == 0)
		throw new ArithmeticException("Division by zero");
		return a / b;
		}
	
	public double cube(double value) {
		return Math.pow(value, 3);
		}
	
	public double log(double value) {
		if (value <= 0)
		throw new IllegalArgumentException("Logarithm undefined for zero or negative input");
		return Math.log(value);
		}
	
		public double modulus(double a, double b) {
		if (b == 0)
		throw new ArithmeticException("Division by zero in modulus");
		return a % b;
		}
	
		
	public void factorial(double value){
		
		
	}

}
