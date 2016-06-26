package bucky;

import java.util.*;

public class GUITwentyFiveMain {
	public static void main(String[] args){
		// Variables
		String[] things = {"eggs", "lasers", "hats", "pie"}; // Array
		List<String> listOne = new ArrayList<String>();
		// Add Array items to List One
		for(String thing : things) // Enhanced for loop
			listOne.add(thing);
		
		String[] morethings = {"lasers", "hats"};
		List<String> listTwo = new ArrayList<String>();
		// Add Array items to List Two
		for(String morething : morethings) // Enhanced for loop
			listTwo.add(morething);	
		
		// Loop through list one
		for(int i = 0; i<listOne.size(); i++){
			System.out.printf("%s ", listOne.get(i));
		}
		
		editList(listOne, listTwo);
		
		System.out.println(); // Blank line
		
		// Loop through list one again
		for(int i = 0; i<listOne.size(); i++){
			System.out.printf("%s ", listOne.get(i));
		}		
	}
	// Method, removes items from list one that are the same as in list two
	public static void editList(Collection<String> lOne, Collection<String> lTwo){
		Iterator<String> iterator = lOne.iterator(); // Goes through each item in the list
		while(iterator.hasNext()){
			if(lTwo.contains(iterator.next()))
				iterator.remove();
		}
	}
}
