package com.dxc.collections;

import java.util.Comparator;

public class CustomCompartor implements Comparator<Integer> {

	@Override
	public int compare(Integer int1, Integer int2) {
		
		String str1 = int1.toString();
		String str2 = int2.toString();
		
		return -str1.compareTo(str2);
	}
}
