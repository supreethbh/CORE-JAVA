package com.dxc.oops;

public abstract class BankDeposit implements IBank {
	
	@Override
	public void deposit() {
		
		System.out.println("Amount has been successfully withdrawn.........");	
	}
	
	public abstract void withdraw();
}
