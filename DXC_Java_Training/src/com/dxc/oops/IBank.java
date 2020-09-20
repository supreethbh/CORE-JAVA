package com.dxc.oops;

public interface IBank {
	
	public static final String BANKNAME = "HDFC Bank";
	public static final String IFSC = "HDFC0000240";
	public static final String BRANCH = "HYDERABAD";
	
	public abstract void deposit();
	
	public abstract void withdraw();
	
	public abstract void bankDetails();
}
