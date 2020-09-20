package com.dxc.java8features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

    public static void main(String[] args) throws IOException {
	
	//1. Integer Stream
	
	System.out.println("-------------------------");
	IntStream
		.range(1, 10)
		.forEach(System.out::print);
	System.out.println("\n-------------------------");
	
	//2. Integer Stream with skip()
	
	IntStream
		.range(1, 10)
		.skip(5)
		.forEach(printRange -> System.out.print(printRange + " "));
	System.out.println("\n-------------------------");
	
	//3. Integer Stream with sum()
	
	System.out.print("Sum of range(1, 10): " + IntStream
				.range(1, 10)
				.sum());
	System.out.println("\n-------------------------");
	
	//4. Stream.of(), sorted() & fingFirst()
	
	Stream.of("Krishna", "Bharatha", "Karnataka")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
	System.out.println("-------------------------");
	
	//5. Stream from Array --> Arrays.stream(), sort(), filter(), print()
	
	String names[] = {"Anil", "Anu", "ANI", "Arun", "Sara", "Bhutha"};
	Arrays.stream(names)
		.filter(filter -> filter.startsWith("A"))
		.sorted()
		.forEach(System.out::println);
	
	System.out.println("-------------------------");
	
	//6. Average of Square of an int array[]
	
	Arrays.stream(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9})
		.map(x -> x * x)
		.average()
		.ifPresent(System.out::println);
	
	System.out.println("-------------------------");
	
	
	//7. Stream from List , sort(), filter(), print()
	
	List<String> people = Arrays.asList("Anil", "Anu", "ANI", "Arun", "Sara", "Bhutha");
	people
	      .stream()
	      .map(String::toLowerCase)
	      .filter(x -> x.startsWith("a"))
	      .forEach(System.out::println);
	
	System.out.println("-------------------------");
	
	//8. Stream rows from text file, sort, filter, print
	
	Stream<String> bands1 = Files.lines(Paths.get("input.txt"));
	bands1
	    .sorted()
	    .filter(x -> x.length() > 8)
	    .forEach(System.out::println);
	bands1.close();
	System.out.println("-------------------------");
	
	//9. Stream rows from text file & save to List
	
	List<String> bands2 = Files.lines(Paths.get("input.txt"))
	    .filter(x -> x.contains("Ind"))
	    .collect(Collectors.toList());
	bands2.forEach(x -> System.out.println(x));  
	
	System.out.println("-------------------------");		
		
	//10. Stream rows from CSV file & count
	
	Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
	
	int rowCount = (int) rows1
		.map(x -> x.split(","))
		.filter(x -> x.length == 3)
		.count();
	System.out.println(rowCount + " rows.");
	rows1.close();
	
	System.out.println("-------------------------");
	
	//11. Stream rows from CSV file & parse data from rows
	
	Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
	rows2
	     .map(x -> x.split(","))
	     .filter(x -> x.length == 3)
	     .filter(x -> Integer.parseInt(x[1]) > 15)
	     .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
	rows2.close();
	
	System.out.println("-------------------------");
    }
    
}
