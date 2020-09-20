package com.dxc.basics;

public class RandomClass {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			int random = (int) (Math.random() * 1000000);
			
			if (random >= 100000) {
				
				System.out.println(i + ". " + random);
			}
		}
	}
}
