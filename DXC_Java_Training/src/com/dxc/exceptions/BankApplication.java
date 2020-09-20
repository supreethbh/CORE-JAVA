package com.dxc.exceptions;

public class BankApplication {

	public static void main(String[] args) {
		
		int[] account = { 101, 102, 103, 104 };
		String[] names = { "KING", "SMITH", "ADAM", "FORD" };
		double[] amount = { 500000, 7000, 200, 4000 };
		
		for (int i = 0; i < amount.length; i++) {
			System.out.println(account[i] + "  " + names[i] + "  " + amount[i]);
			
			if(amount[i] < 1000){
				
				try {
					throw new LowBalanceException(" maintain minimum balance in your account");
					
				} catch (LowBalanceException lbe) {
					
						System.err.println(names[i] + lbe.getMessage());
				}			
			}
		}
	}
}
