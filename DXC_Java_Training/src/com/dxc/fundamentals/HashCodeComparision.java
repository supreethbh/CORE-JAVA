package com.dxc.fundamentals;

public class HashCodeComparision {

	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 7;
		
		HashCodeComparision hashCode1 = new HashCodeComparision();
		
		HashCodeComparision hashCode2 = new HashCodeComparision();
		
		boolean bool = hashCode1.equals(hashCode2);
		
		System.out.println(bool);
		
		System.out.println(hashCode1 == hashCode2);
		
		System.out.println(num1 == num2);
	}

}
