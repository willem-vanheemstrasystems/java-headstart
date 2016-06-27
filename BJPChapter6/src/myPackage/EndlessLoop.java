/**
 * 
 */
package myPackage;

import java.util.ArrayList;

/**
 * @author user
 *
 */
public class EndlessLoop {
	/**
	 * @param args
	 */
	// Class variable
	static ArrayList<String> myStrings = new ArrayList<String>();
	
	public static void main(String[] args) {
		// Variables
		// For loop
		for(int i = 0; i >= 0; i++){
			// THIS CAUSES AN OutOfMemoryError: myStrings.add("String number: " + i);
		}
	}
}
