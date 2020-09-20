package com.dxc.java8features;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		/* Lambda Expression (or) Arrow Function */
		IJava8Interface javaInt = (int a, int b) -> a + b;
		
		int  res = javaInt.add(108, 360);

		System.out.println(res);
		
		/* Calling Static method of Interface */
		IJava8Interface.staticMethod1();
		
		
		/* Consumer Functional Interface */
		IConsumerInterface consInt = System.out::print;
		
		consInt.setName("Bharatha Varsha");
		
		
		/* Supplier Functional Interface */ 
		ISupplierInterface supInt = () -> { 
			
			System.out.println("This is Supplier Functional Interface"); 
			return 100;
		}; 
			
		int result = supInt.getData();
		System.out.println("Return value of Supplier Functional Interface : " + result);
		
		
		/* Predicate Functional Interface */ 
		IPredFunInterface predInt  = () -> { 
			return true;
		};
		
		boolean bool = predInt.isValid();
		System.out.println(bool);
		
		
		/* Function Functional Interface */
		IFunctInterface funInt = (s, a) -> {
			System.out.println(s + " is " + a + "th largest country..");
			return a;	
		};
		
		funInt.fun("India", 7);
	}
}
