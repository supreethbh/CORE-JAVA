package com.dxc.java8features;

public interface IJava8Interface {

	public abstract int add(int a, int b); /* Bi-Function FunctionalInterface */

	public static void staticMethod1() {
		
		System.out.println("This is static() method from Functional Interface");		
	}
	
	public static void staticMethod2() {
		
		
	}
	
	public default void getInfo() { 
		
		System.out.println("This is default() method in java 8");
	}
	
	public static void verifyCredit() {
			
		System.out.println("Logic for credit card verification");
	}
}
