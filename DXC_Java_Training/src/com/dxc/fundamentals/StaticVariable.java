package com.dxc.fundamentals;

public class StaticVariable {

	static int empID = 0;
	static String empName = null;
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		StaticVariable statictVar1 = new StaticVariable();
		
		statictVar1.empID = 101;
		statictVar1.empName = "Supreeth";
		
		StaticVariable statictVar2 = new StaticVariable();
		
		statictVar2.empID = 102;
		statictVar2.empName = "Harshith";
		
		System.out.println(statictVar1.empID);
		System.out.println(statictVar1.empName);
		
		System.out.println(statictVar2.empID);
		System.out.println(statictVar2.empName);
		
		System.out.println(StaticVariable.empID);
		System.out.println(StaticVariable.empName);
	}
}
