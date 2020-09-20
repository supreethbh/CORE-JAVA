package com.dxc.strings;

public class SubString {

	public static void main(String[] args) {
		
		String emailID = "Supreeth.h.gowda@gmail.com";
		
		if (emailID != null) {
			
			for (int i = 0; i < emailID.length() - 10; i++) {
				
				if (emailID.substring(-10, -1) == "@gmail.com") {
					
					System.out.println("True");
				}
			}
			System.out.println("False");
		}
	}
}
