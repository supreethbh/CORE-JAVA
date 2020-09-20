package com.dxc.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Utilities {

	public static void main(String[] args) {
		
		Integer[] array = {3, 7, 5, 4, 108, 9};
		
		/* array[] to List */
		
		List<Integer> list =  Arrays.asList(array);
		
		System.out.println(list);
		
		Arrays.sort(array);
		System.out.print("Sorted Array : [ ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
		
		/* Binary search */
		
		int pos = Arrays.binarySearch(array, 108);
		
		System.out.println("Position : " + pos);
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(108);
		list1.add(8);
		list1.add(3);
		list1.add(7);
		list1.add(5);
		list1.add(4);
		
		Integer[] a = list1.toArray(new Integer[list.size()]);
		System.out.print("List to Array : [ ");
		for( int i=0; i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
			
		Collections.synchronizedList(list1);
		
		int index =	Collections.binarySearch(list, 5);
		System.out.println("\nIndex : " + index);
		
		CustomCompartor comparator = new CustomCompartor(); /* When we need Customised Sorting logic */
		
		Collections.sort(list1, comparator);	
		System.out.println(list1);
	}
}
