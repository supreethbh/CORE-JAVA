package com.dxc.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetStringBuf {

	public static void main(String[] args) {
	
		Set<StringBuffer>  set  = new TreeSet<StringBuffer>(new BufComparator());	
		
		set.add(new StringBuffer("A"));
		set.add(new StringBuffer("D"));
		set.add(new StringBuffer("C"));
		set.add(new StringBuffer("B"));
		
		System.out.println(set);
	}
}
