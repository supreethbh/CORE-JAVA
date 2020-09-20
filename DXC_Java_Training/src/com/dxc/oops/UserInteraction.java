package com.dxc.oops;

import java.util.Scanner;

public class UserInteraction {

	public static void main(String[] args) {
		
		Scanner scanner = null;
		
				scanner = new Scanner(System.in);
		System.out.println("1 : Bank Details");		
		System.out.println("2 : Deposit");
		System.out.println("3 : Withdraw");
		System.out.println("4 : Exit");
		
		IBank ibank = new BankWithdraw();
		
		System.out.println("Enter the choice....");
		
		int choice = scanner.nextInt();
		
		switch (choice) {
		
		case 1: ibank.bankDetails();
			
			break;
		
		case 2: ibank.deposit();
		
			break;
		
		case 3: ibank.withdraw();
		
			break;
		
		case 4: System.exit(0);
		
			break;

		default: System.err.println("Invalid choice....."
						+ "\nPlease enter valid choice to continue......");
			break;
		}
		
		scanner.close();

	}
}
