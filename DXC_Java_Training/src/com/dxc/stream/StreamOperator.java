package com.dxc.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperator {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("DRDO", "SBI India", "NDRF", "BEL Electronics");
		
		Stream<String>	stream =  list.stream();
		
		stream.map((str)->str.length()).forEach(System.out::println);
		
		/*
		 * List<Integer> list1 = stream.map((str)->str.length()).collect(Collectors.toList());
		 * list1.forEach(arg -> System.out.print(arg + " "));
		 */
		/*
		 * stream.map((str)->str.length()).filter( (len)-> len > 5).forEach(System.out::println);
		 */

		/*
		 * stream.map((str)->str.length()).filter( (len)-> len > 5).distinct().forEach(System.out::println);
		 */
	}
}
