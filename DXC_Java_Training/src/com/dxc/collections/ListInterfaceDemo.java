package com.dxc.collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceDemo {

	public static void main(String[] args) {

		List<Object> list = null;
			         list = new ArrayList<>();
			 
			         //list = new LinkedList<Object>(); 
			         //list = new Vector<Object>();
						 
		list.add(7);
		list.add("Nava Bharatha");
		list.add(null);
		list.add(7);
		list.add(null);
		list.add(365.2425);
		list.add('I');
		list.add(true);
		
		System.out.println(list);
	}
}
