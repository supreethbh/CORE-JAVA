package com.dxc.exceptions;

public class ThrowException {

	public static int div(int a, int b) throws ArithmeticException { 
		
		return a / b;
	}
	
	public static void main(String[] args) { // caller

		int arr[] = { 1, 2, 3 };

		System.out.println("Open File");
		
		try {
			
			String s = "5000abc";
			int num = Integer.parseInt(s); /* 5000abc */
			System.out.println(num);

			System.out.println(arr[0]);
			
			int result = div(5, 5);
			System.out.println(result);
			
		} catch (ArithmeticException ae) {
			
			System.err.println("Number cannot be divided by zero");

		} catch (ArrayIndexOutOfBoundsException ai) {

			System.err.println("Array index out of range");

		} catch (Exception e) {

			System.err.println("Some error found application failed");

		} finally {
			
			System.out.println("Close File");
		}
	}
}
