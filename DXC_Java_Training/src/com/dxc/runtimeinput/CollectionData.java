package com.dxc.runtimeinput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionData {

	public static void main(String[] args) {
		
		Scanner scanner = null;
				scanner = new Scanner(System.in);
				
		System.out.println("Enter the size ");
		
		Integer size = scanner.nextInt();
		
		List<Integer> list = new ArrayList<Integer>(size);
		
		for (int i = 0; i < size; i++) {
			
			System.out.println("Enter " + i + "th element ");
		
			list.add(scanner.nextInt());
		}
		
		System.out.println("\nList Elements : " + list);
		
		scanner.close();
	}
}
