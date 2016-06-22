package bucky;

import java.util.*;

public class GUITwentyNineMain {
	public static void main(String[] args){
		// Variables
		String[] things = {"stone", "chair", "table", "cup", "laptop"};
		// Convert Array to List
		List<String> list = Arrays.asList(things);
		// Sort the list
		Collections.sort(list); // Sorts alphabetically
		System.out.printf("%s\t", list);
		System.out.println(); // Blank line
		Collections.sort(list, Collections.reverseOrder()); // Sorts in reverse
		System.out.printf("%s\t", list);
	}
}
