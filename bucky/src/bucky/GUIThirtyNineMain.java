package bucky;

import java.util.*;

public class GUIThirtyNineMain {
	public static void main(String[] args){
		// Print the maximum out of three numbers
		System.out.println(max(23,42,1));
		// Print the maximum out of three strings
		System.out.println(max("bravo","gamma","zulu"));
	}
	// Generic Method
	// Note: you can only use objects that extend Comparable
	public static <T extends Comparable<T>> T max(T a, T b, T c){
		// Find the maximum of the three variables provided
		// Assuming a is the maximum
		T maximum = a;
		// Compare
		if(b.compareTo(a) > 0) // Is b larger than a
			maximum = b; // The maximum would be b
		if(c.compareTo(maximum) > 0) // Is c larger than the maximum
			maximum = c; // The maximum would be c		
		return maximum;
	}
}
