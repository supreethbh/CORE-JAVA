package com.dxc.fundamentals;

public class ControlStatements {

	public static void main(String[] args) {
		
		int[] list = {10,20,30,44,56,25,45};
		
		System.out.println("--------FOR LOOP--------");
		
		for (int i = 0; i < list.length; i++) {
			System.out.println("list[" + i + "] = " + list[i]);
		}
		
		System.out.println("--------WHILE LOOP------");
		
		int i = 0;
		while (i < list.length) {
			System.out.println("list[" + i + "] = " + list[i]);
			i++;
		}
		
		System.out.println("--------DO-WHILE LOOP-----");
		i = 0;
		do {
			System.out.println("list[" + i + "] = " + list[i]);
			i++;
			
		} while (i < list.length);
		
		System.out.println("----SWITCH STATEMENT--------");
		
	}
}