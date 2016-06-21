package bucky;

import java.util.*;

public class GUITwentySixMain {
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
	}
}
