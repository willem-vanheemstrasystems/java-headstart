package bucky;

public class GUITwentyTwoMain {
	public static void main(String[] args){
		// Variables
		String string = "buckrogersbuckrogers";
		// Search for 'k'
		System.out.println(string.indexOf("k")); // returns 3
		// Search for 'k', but ignore the first 5 characters
		System.out.println(string.indexOf("k", 5)); // returns 13
		// Search for 'x', a non-present character
		System.out.println(string.indexOf("x")); // returns -1, false		
		// Concatenation
		String a = "Bacon ";
		String b = "monster";
		System.out.println(a+b); // returns Bacon monster
		System.out.println(a.concat(b)); // returns Bacon monster
		// Replacement
		System.out.println(a.replace("B", "F")); // returns Facon
		// Case
		System.out.println(b.toUpperCase()); // returns MONSTER
		// Trimming
		System.out.println(a.trim()); // returns Bacon
		
		
		
		
	}
}
