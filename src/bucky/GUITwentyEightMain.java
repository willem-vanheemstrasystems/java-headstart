package bucky;

import java.util.*;

public class GUITwentyEightMain {
	public static void main(String[] args){
		// Variables
		String[] things = {"melons", "apples", "carrots", "pears"};
		// Create a list that contains the Array
		LinkedList<String> list = new LinkedList<String>(Arrays.asList(things));
		// Now we can use List methods on the things 
		list.add("pumpkins"); // Will add to the end of the list
		list.addFirst("cucumbers"); // Will add to the beginning of the list
		// After these changes, convert the List back to an Array
		things = list.toArray(new String[list.size()]);
		// Enhanced for loop
		for(String thing: things)
			System.out.printf("%s\t", thing);
	}
}
