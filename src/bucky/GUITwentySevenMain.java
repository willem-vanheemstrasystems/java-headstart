package bucky;

import java.util.*;

public class GUITwentySevenMain {
	public static void main(String[] args){
		// Variables
		String[] things = {"apples","pears","tomatoes","cherries","bananas"};
		List<String> listOne = new LinkedList<String>();
		// Add things to list one
		for(String thing: things) // Enhanced for loop
			listOne.add(thing);
		String[] morethings = {"sausages", "bikes", "tomatoes", "chocolates"};
		List<String> listTwo = new LinkedList<String>();
		// Add more things to list two
		for(String morething: morethings) // Enhanced for loop
			listTwo.add(morething);		
		// Add all from list two to list one
		listOne.addAll(listTwo);
		// Free up memory by emptying listTwo
		listTwo = null;
		
		printMe(listOne);
		removeItems(listOne, 2, 5);
		printMe(listOne);
		reverseMe(listOne);
	}
	// Method print me
	private static void printMe(List<String> list){
		for(String listItem: list) // Enhanced for loop
			System.out.printf("%s ", listItem);
		System.out.println(); // Blank line
	}
	// Method remove items
	private static void removeItems(List<String> list, int from, int to){
		// Remove a portion of the list
		list.subList(from, to).clear();
	}
	// Method reverse me
	private static void reverseMe(List<String> list){
		// Note: list.size() is the last item in the list
		ListIterator listIterator = list.listIterator(list.size());
		while(listIterator.hasPrevious())
			System.out.printf("%s ", listIterator.previous());
	}
}
