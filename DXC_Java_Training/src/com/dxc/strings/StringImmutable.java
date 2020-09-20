package com.dxc.strings;

public class StringImmutable {

	public static void main(String[] args) {

		String str1 = "Indian Navy";
		
		String str2 = new String("Indian Air Force");
		
		String str3 = "Indian Army";
		
		System.out.println("Before String - 1 : " + str1);
		System.out.println("Before String - 2 : " + str2);
		System.out.println("Before String - 3 : " + str3);
		
		          str1 = str1 +", "+  str2 +", " + str3;
		          
		          str2 = str2 +", "+  str1 +", " + str3;
		          
		          str3 = str3 +", "+  str2 +", " + str1;
		          
		 System.out.println("--------------------------------------------------------");
		
		System.out.println("After String - 1 : " + str1);
		System.out.println("After String - 2 : " + str2);
		System.out.println("After String - 3 : " + str3);
	}
}
