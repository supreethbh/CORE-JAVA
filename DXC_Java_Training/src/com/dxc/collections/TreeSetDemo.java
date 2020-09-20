package com.dxc.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<String>();  /* Natural order only for String, Wrappers */
		
		set.add(new String("A"));
		set.add(new String("D"));
		set.add(new String("C"));
		set.add(new String("B"));
		
		System.out.println(set.toString());
	}
}
