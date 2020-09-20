package com.dxc.runtimeinput;

import java.util.Scanner;

public class ArrayData {

	public static void main(String[] args) {

	Scanner scanner = null;
			scanner = new Scanner(System.in);
			
	System.out.println("Enter the array size : ");
	
	int size = scanner.nextInt();
			
	int[] array = new int[size];
	
	for (int i = 0; i < array.length; i++) {
		
		System.out.println("Enter " + i + "th element");
		
		array[i] = scanner.nextInt();
	}
	
	System.out.print("Array Elements : [");
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i] + " ");
	}
	System.out.print("]");
	
	scanner.close();
	}
}
