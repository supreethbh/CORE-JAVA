package com.dxc.basics;

import java.util.Scanner;

public class ScannerClass1 {

	public static void main(String[] args) {

		Scanner scanner = null;
		        scanner = new Scanner(System.in);

		System.out.println("Enter  Name");

		String firstName = scanner.nextLine();

		System.out.println("Enter salary");

		int salary = scanner.nextInt();
		
		scanner.nextLine(); /* Control Enter key */

		System.out.println("Enter Fathers Name");

		String lastName = scanner.nextLine();

		System.out.println("First Name : " + firstName);
		System.out.println("Last Name  : " + lastName);
		System.out.println("Salary     : " + salary);
		
		scanner.close();
	}
}
