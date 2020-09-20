package com.dxc.junit.dev;

public class Client {

	public static void main(String[] args) {
		
		Calculator calculator = null;
				   calculator = new Calculator();

		System.out.println("The sum of the numbers is : "  + calculator.addition(5, 5));
		
		System.out.println("The sum of the numbers is : "  + calculator.subtraction(5, 5));
		
		System.out.println("The product of the numbers is : "  + calculator.multiplication(5, 5));
	}
}
