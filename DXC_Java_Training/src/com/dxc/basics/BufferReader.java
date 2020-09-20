package com.dxc.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
	
	public static void main(String[] args) {
		
		InputStreamReader inputStream = null;
		BufferedReader bufRead  = null;
		
		String str;
		try {
			
			inputStream = new InputStreamReader(System.in);
			bufRead  = new BufferedReader(inputStream);
			
			System.out.println("Enter Employee ID : ");
			
			str = bufRead.readLine();
			int empID = Integer.parseInt(str);
			
			System.out.println("Enter Employee Name");
			String empName = bufRead.readLine();
			
			System.out.println("Enter salary");
			
			str = bufRead.readLine();
			double salary = Double.parseDouble(str);
			
			System.out.println();
			
			System.out.println("Emlployee ID     : " + empID);
			System.out.println("Emlployee Name   : " + empName);
			System.out.println("Emlployee Salary : " + salary);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				inputStream.close();
				bufRead.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
