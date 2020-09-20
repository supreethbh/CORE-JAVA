package com.dxc.threading;

public class ThreadImplements implements Runnable {

	@Override
	public void run() {
		System.out.println("Overridden run() of Runnable Interface.......");
	}

	public static void main(String[] args) {
		
		Thread thread = new Thread(new ThreadImplements());
		System.out.println(thread);
		thread.start();
	}
}
