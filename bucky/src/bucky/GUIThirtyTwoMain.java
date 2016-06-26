package bucky;

import java.util.*;

public class GUIThirtyTwoMain {
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
	}
}
