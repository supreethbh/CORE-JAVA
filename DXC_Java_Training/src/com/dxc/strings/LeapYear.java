package com.dxc.strings;

public class LeapYear {

	public static void main(String[] args) {
		
		final double leapYear = 365.2425 * 24 * 60 * 60;
		
		final long leap =  (long) leapYear;
		System.out.println("One Leap Year : " + leapYear + " Km");
		System.out.println("One Leap Year : " + leap + " Km");
		
		String s1=Integer.toString(7,2);
		String s2=Integer.toString(17,2);
		System.out.println(s1);//111
		System.out.println(s2);//10001
	}
}
