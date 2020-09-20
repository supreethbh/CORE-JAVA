package com.dxc.fundamentals;

public class Constructors extends University {
	
	int studentID;
	String studentName;
	
	public Constructors() {
		super();
		System.out.println("Constructor() is being called.......");
	}
	
	public Constructors(int studentID, String studentName) {
		this();
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public static void main(String[] args) {
		
		Constructors constructors = new Constructors(101, "Supreeth");
					  
		System.out.println(constructors.studentID);
		System.out.println(constructors.studentName);
	}
}
