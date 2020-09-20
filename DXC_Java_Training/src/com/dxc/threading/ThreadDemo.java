package com.dxc.threading;

public class ThreadDemo extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {

			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		ThreadDemo th1 = new ThreadDemo();
		th1.setName("Indian Navy");
		
		ThreadDemo th2 = new ThreadDemo();
		th2.setName("Indian Air Force");
		
		th1.start();
		th2.start();
	}
}
