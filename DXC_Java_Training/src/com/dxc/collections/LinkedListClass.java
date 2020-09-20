package com.dxc.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {

	public static void main(String[] args) {
		
		List<Integer> linkedList = new LinkedList<>();
		
		linkedList.add(new Integer(3));
		linkedList.add(7);
		linkedList.add(108);
		linkedList.add(360);
		linkedList.add(4);
		linkedList.add(9);
		
		List<Integer> linkedList1 = new LinkedList<>(linkedList);
		
		System.out.println(linkedList.equals(linkedList1));
		System.out.println(linkedList.getClass());
		System.out.println("------------------------------------------");
		
		System.out.println("Size : " + linkedList.size());
		System.out.println(linkedList);
		
		System.out.println("------------------------------------------");
		 
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println("LinkedList[" + i + "] = " + linkedList.get(i));
		}
		 
		System.out.println("------------------------------------------");
		
		/* Operations On LinkedList */

		linkedList.add(5,100);
		System.out.println("Size : " + linkedList.size());
		System.out.println(linkedList);
		
		System.out.println("------------------------------------------");
		
		System.out.println(linkedList1.get(1)); //get value at specific index 
		
		System.out.println("------------------------------------------");
		
		System.out.println(linkedList.indexOf(360)); // get index of specified value
		
		System.out.println("------------------------------------------");
		
		System.out.println(linkedList.remove(2)); // remove data at specified index
												 // If index exceeds then JVM will throw IndexOutOfIndex Exception
		System.out.println(linkedList);
		
		System.out.println("------------------------------------------");
		
		/*
		 * linkedList.add(8,200); // IndexOutOfIndex Exception : size is 7, we are trying to add data at index 8th
		 * System.out.println(linkedList);
		 */
		
		System.out.println(linkedList.addAll(linkedList)); // true : return type is boolean (successfully added)
		System.out.println("Size : " + linkedList.size());
		System.out.println(linkedList); //PrintStream : returns value
		
		System.out.println("------------------------------------------");
		
		/* Sorting of LinkedList */
		
		Collections.sort(linkedList1);
		System.out.println("Ascending Order :");
		System.out.println(linkedList1);
		
		System.out.println("------------------------------------------"); 
		
		Collections.sort(linkedList1, Collections.reverseOrder());
		System.out.println("Descending Order :");
		System.out.println(linkedList1);
		
		System.out.println("------------------------------------------"); 
		
		
	}
}
