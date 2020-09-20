package com.dxc.fundamentals;

public class InstanceVariable {

	int empID;
	String empName;
	
	public static void main(String[] args) {
		
		InstanceVariable instVar1 = new InstanceVariable();
		
		instVar1.empID = 101;
		instVar1.empName = "Supreeth";
		
		System.out.println("Employee ID - 1   : " + instVar1.empID);
		System.out.println("Employee Name - 1 : " + instVar1.empName);
		
		InstanceVariable instVar2 = new InstanceVariable();
		
		instVar2.empID = 102;
		instVar2.empName = "Harshith";
		
		System.out.println("Employee ID - 2   : " + instVar2.empID);
		System.out.println("Employee Name - 2 : " + instVar2.empName);
	}
}