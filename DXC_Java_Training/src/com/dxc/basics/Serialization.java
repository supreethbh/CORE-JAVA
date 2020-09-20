package com.dxc.basics;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setEmpID(101);
		emp.setEmpName("Supreeth Gowda");
		emp.setContNum(7337711366l);
		
		FileOutputStream fileOut = null;
		ObjectOutputStream objectOut = null;
		try {
			
			fileOut = new FileOutputStream("employee.ser");
			objectOut = new ObjectOutputStream(fileOut);
			
			objectOut.writeObject(emp);
			System.out.println("Object serialized......");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
