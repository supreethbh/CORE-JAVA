package com.dxc.collections;

import java.util.Comparator;

public class BufComparator implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer arg0, StringBuffer arg1) {
		
		String str1 = arg0.toString();
		String str2 = arg1.toString();
		
		return - str1.toString().compareTo(str2);
	}
}
