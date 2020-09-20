package com.dxc.fundamentals;

public class University extends Object {
	
	int uniID = 342;
	String uniName = "DXC.technology";

	public University() {
		
		this(102, "DXC.technology");
		System.out.println("University() is being called........");
	}

	public University(int i, String string) {
		super();
		System.out.println(uniID);
		System.out.println(uniName);
	}
}
