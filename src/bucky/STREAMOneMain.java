package bucky;

import java.util.*;
import static java.util.stream.Collectors.*;

public class STREAMOneMain {
	public static void main(String[] args){
		// Variables

		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		// Multiply each number by two using streams
		// A Stream is a more powerful Iterator
		List<Integer> results = 
			numbers.stream()
				.filter(element -> element % 2 == 0) // Filter for only even numbers, using modulo %
				.map(element -> element * 2) // Double the element
				.collect(toList()); // Put the result into a collection
			
		// Convert List to Array
		results.toArray();
		// Enhanced for loop
		for(int result: results)
			System.out.printf("%d\t", result);
	}
}
