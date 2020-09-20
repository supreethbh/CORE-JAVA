package com.dxc.basics;

import java.util.Scanner;

public class ScannerClass {

	public static void printDetails(String firstName, String lastName, char gender, int age, double weight) {
	
		System.out.println("Personal Details :");
		
		System.out.println("-------------------------------------");
		System.out.println("First Name : " + firstName);
		System.out.println("Last Name  : " + lastName);
		System.out.println("Gender     : " + gender);
		System.out.println("Age        : " + age + " years");
		System.out.println("Weight     : " + weight + " KG");
		System.out.println("-------------------------------------");
	}
	
	public static void main(String... args) {
	
		Scanner scanner = null;
				scanner = new Scanner(System.in);
		
		System.out.println("Enter the First Name : ");
		String firstName = scanner.nextLine();
		
		System.out.println("Enter the Last Name : ");
		String lastName = scanner.nextLine();
		
		System.out.println("Enter the Gender : ");
		char gender = scanner.next().charAt(0);
		
		System.out.println("Enter the Age :");
		int age = scanner.nextInt();
		
		System.out.println("Enter the weight : ");
		double weight = scanner.nextDouble();
		
		System.out.println("-------------------------------------");
		printDetails(firstName, lastName, gender, age, weight);
		
		scanner.close();
	}
}
