package com.dxc.fundamentals;

public class AccessModifier {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		InstanceVariable inst = new InstanceVariable();
		System.out.println(inst.empID);
		System.out.println(inst.empName);
		
		StaticVariable stat = new StaticVariable();
		System.out.println(stat.empID);
		System.out.println(stat.empName);
		
	}
}
