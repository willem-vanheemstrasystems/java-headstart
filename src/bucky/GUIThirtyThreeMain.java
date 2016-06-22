package bucky;

import java.util.*;

public class GUIThirtyThreeMain {
	public static void main(String[] args){
		// Variables
		String[] fruitsArray = {"apple", "pear", "cherry", "banana"};
		List<String> fruitsList = Arrays.asList(fruitsArray);
		// Create an ArrayList
		// Note: an ArrayList can change in size
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("sweet");
		arrayList.add("savory");
		arrayList.add("sour");
		// Enhanced for loop
		for(String flavour: arrayList)
			System.out.printf("%s\t", flavour);
		// Add all items to arrayList from fruitsArray
		Collections.addAll(arrayList, fruitsArray);
		System.out.println(); // Blank line
		for(String flavour: arrayList)
			System.out.printf("%s\t", flavour);
		System.out.println(); // Blank line
		// Show how many times (i.e. the frequency) an item exists in the list
		System.out.println(Collections.frequency(arrayList, "savory"));
		// Check of there are no similar items in between two lists
		boolean trueOrFalse = Collections.disjoint(fruitsList, arrayList);
		System.out.println(trueOrFalse); // returns false, as there are now items in common
		if(trueOrFalse)
			System.out.println("These lists have no items in common.");
		else
			System.out.println("These lists have items in common.");
	}
}
