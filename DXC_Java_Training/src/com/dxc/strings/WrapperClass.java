package com.dxc.strings;

public class WrapperClass {

	public static void main(String[] args) {
		
		int num1 = 10;
		
		int num2 = 20;
		
		Integer integer1 = new Integer(num1);
		
		Integer integer2 = new Integer(4);
		
		int res = integer1;
		
		Long lon = new Long(108);
		
		System.out.println(integer1 + 5);
		System.out.println(integer1.toString() + num1 + num2);
		System.out.println(integer2.intValue() + num2);
		System.out.println("Integer value : " + integer1);
		System.out.println("Long value : " + lon);
		System.out.println("Integer value : " + integer2); 
		System.out.println(res);
		
		Boolean bool1 = new Boolean("Yes");
		Boolean bool2 = new Boolean("No");
		
		System.out.println(bool1 + " + " + bool2);
		
		System.out.println(bool1.equals(bool2));
		System.out.println(bool1 == bool2);
	}
}
