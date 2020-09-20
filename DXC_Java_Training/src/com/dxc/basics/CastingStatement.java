package com.dxc.basics;

public class CastingStatement {

	public static void main(String[] args) {
		
		int inum = 1997;
		
		byte bnum = (byte) 140;
		
		long lnum = 12345678;
		
		int longToInt = (int) lnum;
		
		double dnum = 12345.78;
		
		float fnum = 123.75f;
		
		float doubleToFloat = (float) dnum;
		
		int doubleToInt = (int) dnum;
		
		double intToDouble = inum;
		
		System.out.println("Welcome to DXC.technology's Java Training......");
		System.out.println("Integer number :" + inum);
		System.out.println("Byte number :" + bnum);
		System.out.println("Long number :" + lnum);
		System.out.println("Float number : " + fnum);
		System.out.println("Double Number : " + dnum);
		System.out.println("Long To Integer : " + longToInt);	
		System.out.println("Double To Float : " + doubleToFloat);
		System.out.println("Double To Integer : " + doubleToInt);
		System.out.println("Integer To Double : " + intToDouble);
		
	}
}