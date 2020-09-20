package com.dxc.exceptions;

public class CheckedException {

	public static void main(String[] args) {

		try {
			
			Thread.sleep(2000);
			System.err.println("Who Interrupted me...., I was sleeping");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
}
