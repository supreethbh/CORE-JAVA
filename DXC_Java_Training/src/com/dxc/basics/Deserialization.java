package com.dxc.basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		
		FileInputStream fileInput = null;
		ObjectInputStream objectInput = null;
		
		try {
			
			fileInput = new FileInputStream("employee.ser");
			objectInput = new ObjectInputStream(fileInput);
			
			Employee emp = (Employee) objectInput.readObject();
			
			System.out.println("Object deserialized....\n");
			System.out.println(emp);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
