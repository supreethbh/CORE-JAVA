package com.dxc.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableMap {

	public static void main(String[] args) {
		
		Hashtable<Integer,String>  map = new Hashtable<Integer,String>();
		
		map.put(1, "ISRO");
		map.put(4, "IAF");
		map.put(3, "DRDO");
		map.put(2, "HAL");
		map.put(5, "BHEL");
		
		System.out.println(map);
		
		/* Set<Integer> set = map.keySet(); */
		
		Enumeration<String> enumeration = map.elements();

		while (enumeration.hasMoreElements()) {
			
			String value =  enumeration.nextElement();
			System.out.println(value);
		}
		
		/*
		 * Iterator     --> hasNext, next, remove 
		 * ListIterator --> hasNext, next, remove, hasPrevious, previous
		 */
	}
}
