package bucky;

import java.util.*;

public class GUITwentyFourMain {
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

		// Loop through list two
		for(int i = 0; i<listTwo.size(); i++){
			System.out.printf("%s ", listTwo.get(i));
		}
	}
}
