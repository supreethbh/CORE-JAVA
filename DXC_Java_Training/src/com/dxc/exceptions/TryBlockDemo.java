package com.dxc.exceptions;

public class TryBlockDemo {
	
	public static void main(String[] args) {
		
		int x = 10 ;
		
		try {
			System.out.println(x/0);	
		} finally {
			System.out.println("End...");
		}
	}
}
