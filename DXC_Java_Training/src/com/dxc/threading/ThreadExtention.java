package com.dxc.threading;

public class ThreadExtention extends Thread {

	@Override
	public void run() {
		System.out.println("Overridden run() is being called......");
	}
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new ThreadExtention());
		System.out.println(thread);
		thread.start();	
	}
}
