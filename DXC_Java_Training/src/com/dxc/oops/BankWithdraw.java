package com.dxc.oops;

public class BankWithdraw extends BankDeposit {

	@Override
	public void withdraw() {
		
		System.out.println("Amount has been successfully deposited.........");
	}

	@Override
	public void bankDetails() {
		System.out.println("Bank Name : " + BANKNAME);
		System.out.println("IFSC Code : " + IFSC);
		System.out.println("Branch    : " + BRANCH);
	}	
}
