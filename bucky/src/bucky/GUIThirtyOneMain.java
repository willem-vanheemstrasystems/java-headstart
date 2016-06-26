package bucky;

import java.util.*;

public class GUIThirtyOneMain {
	public static void main(String[] args) {
		// Variables
		// Note: single quotes (')
		Character[] charactersOne = {'o', 't', 'h', 'u', 'i'};
		// Create list, fill with array
		List<Character> listOne = Arrays.asList(charactersOne);
		System.out.println("List is: ");
		output(listOne);
		// Reverse
		Collections.reverse(listOne);
		System.out.println("After reverse: ");
		output(listOne);
		// Create a new blank Array
		Character[] charactersTwo = new Character[5];
		// Create a new list, fill with blank array
		List<Character> listTwo = Arrays.asList(charactersTwo);
		// Copy contents of listOne into listTwo
		Collections.copy(listTwo, listOne);
		System.out.println("Copy of listOne: ");
		output(listTwo);
		// Fill list with new character 'X', replaces each list item
		Collections.fill(listOne, 'X');
		System.out.println("After fill: ");
		output(listOne);
	}
	// Method 
	private static void output(List<Character> list){
		// Enhanced for loop
		for(Character listItem: list)
			System.out.printf("%s\t", listItem);
		System.out.println(); // Blank line
	}
}
