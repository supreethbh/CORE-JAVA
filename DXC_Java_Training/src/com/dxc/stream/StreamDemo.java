package com.dxc.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		Stream<Integer> stream1 = Stream.of(3, 4, 7, 18, 108);
		
		System.out.print("Stream : ");
		
		stream1.forEach(a -> System.out.print(a + " "));
		
		System.out.println();
		
		String[] name = new String[] {"DRDO", "ISRO", "NDRF", "BHEL"};
		
		System.out.println("String Array : ");
		
		Stream<String> stream2 = Arrays.stream(name);

		stream2.forEach(a -> {
			
					System.out.println(a + " : " + a.length());
				}
		);	
		
		System.out.print("List Value : ");
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Stream<Integer>	stream3 = list.stream();
		
		stream3.forEach(value -> System.out.print(value + " "));
	}
}
