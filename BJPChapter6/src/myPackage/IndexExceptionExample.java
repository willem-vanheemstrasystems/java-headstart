/**
 * 
 */
package myPackage;
/**
 * @author user
 *
 */
public class IndexExceptionExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Variables
		int[] hoursWorked = {7,8,7,9,5};
		int totalHours = 0;
		// For loop
		for(int i = 0; i < hoursWorked.length; i++){
			totalHours += hoursWorked[i];
		}
		System.out.println("Total Hours = " + totalHours);
	}
}
