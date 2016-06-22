package bucky;

import java.util.*;

public class GUIThirtySixMain {
	public static void main(String[] args){
		// Variables
		// Note: a Set doesn't allow duplicate items
		String[] fruitsArray = {"apples", "pears", "apples", "cherries", "pears"};
		List<String> fruitsList = Arrays.asList(fruitsArray);
		System.out.printf("%s", fruitsList);
		System.out.println(); // Blank line
		// Remove duplicate items from the list by using a Set.
		// It will automatically remove duplicates
		Set<String> fruitsHashSet = new HashSet(fruitsList);
		System.out.printf("%s", fruitsHashSet);
	}
}
