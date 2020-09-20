package com.dxc.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetClass {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>(); /* hashCode Order */
		
		System.out.println(set.add(new Integer(1)));
		set.add(new Integer(5));
		set.add(new Integer(3));
		set.add(null);
		set.add(new Integer(4));
		set.add(null);
		System.out.println(set.add(new Integer(1)));
	
		System.out.println(set);
				
		Iterator<Integer> iterator = set.iterator();
			
		while (iterator.hasNext()) {
			
			Integer i =  iterator.next();
			System.out.println(i);
		}
	}
}
