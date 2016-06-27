/**
 * 
 */
package myPackage;
/**
 * @author user
 *
 */
public class EndlessMethodCall {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Variables
		//
		// This causes a StackOverflowError: printMe();
	}
	// Method
	public static void displayMe(){
		printMe();
	}
	// Method
	public static void printMe(){
		displayMe();
	}
}
