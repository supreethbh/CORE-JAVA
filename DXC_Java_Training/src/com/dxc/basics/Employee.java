package com.dxc.basics;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Employee implements Serializable{

	int empID;
	String empName;
	long contNum;
	
	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getContNum() {
		return contNum;
	}

	public void setContNum(long contNum) {
		this.contNum = contNum;
	}

	@Override
	public String toString() {
		return "Employee [Employee ID : " + empID + ", Employee Name : " + empName + ", Contact Number : " + contNum + "]";
	}
}
