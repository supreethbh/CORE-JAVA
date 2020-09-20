package com.dxc.threading;

public class Admission implements Runnable {

	int seats = 1;
	
	@Override
	public synchronized void run() {
		
		System.out.println("Welcome to BGS Institute of Technology");
		System.out.println("Number of seats before : " + seats);
		
		try {
			
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		if (seats > 0) {
			
			System.out.println("Seat is allocated to " + Thread.currentThread().getName());
			seats--;
			
			System.out.println("Number of seats after : " + seats);
		} else {
			System.err.println("Sorry..! Try next year");
		}
	}

	public static void main(String[] args) {
		
		Admission admin = new Admission();
		
		Thread th1 = new Thread(admin, "Indian Army");
		
		Thread th2 = new Thread(admin, "Indian Navy");
		
		th1.start();
		th2.start();
	}
}
