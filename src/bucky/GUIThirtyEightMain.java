package bucky;

import java.util.*;

public class GUIThirtyEightMain {
	public static void main(String[] args){
		// Variables
		Integer[] integerArray = {1,2,3,4};
		Character[] characterArray = {'a','b','c','d'};
		printMe(integerArray);
		printMe(characterArray);
	}
	// Generic Method
	// Notice the use of <T> before void
	private static <T> void printMe(T[] type){
		// Enhanced for loop
		for(T t: type)
			System.out.printf("%s\t", t);
		System.out.println(); // Blank line
	}	
}
