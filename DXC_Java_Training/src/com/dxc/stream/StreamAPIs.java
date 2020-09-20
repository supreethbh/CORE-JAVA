package com.dxc.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class StreamAPIs {

	public static void main(String[] args) {
		
		int[] a = {12,54,34,25,78,96,5};
		IntStream.of(a).min().ifPresent(System.out::println);
		IntStream.of(a).max().ifPresent(System.out::println);
		IntStream.of(a).average().ifPresent(System.out::println);
		System.out.println(IntStream.of(a).sum());	
		System.out.println(IntStream.of(a).count());
		
		/*------------------- OR --------------------*/
		
		IntSummaryStatistics statistics = IntStream.of(a).summaryStatistics();
		
		statistics.getAverage();
		statistics.getClass();
		statistics.getMax();
		statistics.getMin();
		statistics.getSum();
		statistics.getCount();
		
		System.out.println(statistics);
		
		
		int[] num = {10,0,0,2,2,3,1,30,23};
		
		IntStream.of(num).sorted().distinct().limit(3).forEach(System.out::println);
	}
}
