package com.dxc.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Comparator {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(234);
		list.add(746);
		list.add(875);
		list.add(351);
		list.add(444);
		
		
		Collections.sort(list, (o1, o2) ->
		{ 
			return o1 % 10 > o2 % 10 ? 1:-1; 	
		});
		
		list.forEach(System.out::println);
		
		System.out.println();
		
		Integer[] array = list.stream().toArray(Integer[]::new);
		for( int i=0; i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		System.out.println();
		
		Integer[] a = list.toArray(new Integer[list.size()]);
		for( int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
