package com.dxc.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<>();
		 
		arrayList.add(new Integer(3));
		arrayList.add(7);
		arrayList.add(108);
		arrayList.add(360);
		arrayList.add(4);
		arrayList.add(9);
		 
		List<Integer> arrayList1 = new ArrayList<>(arrayList);
		 
		System.out.println(arrayList.equals(arrayList1));
		System.out.println(arrayList.getClass());
		System.out.println("------------------------------------------");
		 
			/* Retrieving Data From ArrayList() */	
		 
		arrayList.forEach(System.out::println);
		
		System.out.println("------------------------------------------");
		
		arrayList.forEach(list -> System.out.print(list + ", "));
		System.out.println();
		
		System.out.println("------------------------------------------");
		
		System.out.println("Size : " + arrayList.size());
		System.out.println(arrayList);
		 
		System.out.println("------------------------------------------");
		 
		for (Iterator<Integer> iterator = arrayList.iterator(); iterator.hasNext();) {
			System.out.println((Integer) iterator.next());
		}
		System.out.println("------------------------------------------");
		 
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("ArrayList[" + i + "] = " + arrayList.get(i));
		}
		 
		System.out.println("------------------------------------------");
		 
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		 
		System.out.println("------------------------------------------");
		 
		Iterator<Integer> iterator= arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println((Integer) iterator.next());
		}
		System.out.println("------------------------------------------"); 
		
		
		/* Operations On ArrayList */
		
		arrayList.add(4, 77);
		System.out.println(arrayList);
		
		System.out.println("------------------------------------------"); 
		
		System.out.println(arrayList.contains(100)); //false : 100 is not present 
		
		System.out.println("------------------------------------------"); 
		
		arrayList.remove(4); //Remove data at Index 4
		System.out.println(arrayList);
		System.out.println("Size : " + arrayList.size());
		
		System.out.println("------------------------------------------");
		
		System.out.println("Size : " + arrayList.size());
		System.out.println(arrayList.removeAll(arrayList)); //true
		
		System.out.println("------------------------------------------"); 
		
		arrayList.clear();
		System.out.println("Size : " + arrayList.size());
		System.out.println(arrayList); //Empty list 
		
		System.out.println("------------------------------------------"); 
		
		System.out.println("Size : " + arrayList.size());
		System.out.println(arrayList.removeAll(arrayList)); //false : No elements to remove
		
		System.out.println("------------------------------------------"); 
		
		
		/* ArrayList() Sorting */
		
		Collections.sort(arrayList1);
		System.out.println("Ascending Order :");
		System.out.println(arrayList1);
		
		System.out.println("------------------------------------------"); 
		
		Collections.sort(arrayList1, Collections.reverseOrder());
		System.out.println("Descending Order :");
		System.out.println(arrayList1);
		
		System.out.println("------------------------------------------"); 
	}
}
