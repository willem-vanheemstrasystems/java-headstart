/**
 * 
 */
package myPackage;
/**
 * @author user
 *
 */
public class BreakLoop {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//
		System.out.println("\nLooping with No Break:");
		for (int x = 0; x < 3; x++){ // outer loop (x loop)
			for (int y = 0; y < 3; y++){ // inner loop (y loop)
				System.out.println("x = " + x + " and y = " + y);
			}
		}
		//
		System.out.println("\nBreak with No Label:");		
		for (int x = 0; x < 3; x++){ // outer loop (x loop)
			for (int y = 0; y < 3; y++){ // inner loop (y loop)
				System.out.println("x = " + x + " and y = " + y);
				if (x == y){ // new conditional expression
					System.out.println("Break out of y loop.\n");
					break; // new break statement
				}
			}			
		}
		//
		System.out.println("\nBreak with Label:");
		outer: // new label
		for (int x = 0; x < 3; x++){ // outer loop (x loop)
			for (int y = 0; y < 3; y++){ // inner loop (y loop)
				System.out.println("x = " + x + " and y = " + y);
				if (x == y){ // new conditional expression
					System.out.println("Break out of both loops.\n");
					break outer; // new break statement with label
				}
			}			
		}
	}
}
