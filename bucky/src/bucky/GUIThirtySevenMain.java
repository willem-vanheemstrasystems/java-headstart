package bucky;

import java.util.*;

public class GUIThirtySevenMain {
	public static void main(String[] args){
		// Variables
		Integer[] integerArray = {1,2,3,4};
		Character[] characterArray = {'a','b','c','d'};
		printMe(integerArray);
		printMe(characterArray);
	}
	// Method
	private static void printMe(Integer[] integer){
		// Enhanced for loop
		for(Integer i: integer)
			System.out.printf("%s\t", i);
		System.out.println(); // Blank line
	}
	// Method
	private static void printMe(Character[] character){
		// Enhanced for loop
		for(Character c: character)
			System.out.printf("%s\t", c);
		System.out.println(); // Blank line	
	}	
}
