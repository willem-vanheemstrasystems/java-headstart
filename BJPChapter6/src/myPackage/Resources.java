/**
 * 
 */
package myPackage;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author user
 *
 */
public class Resources {
	// Class variable
	static Scanner scanner = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Variables
		// Example of a Try-with-resources Block
		// try(Scanner scanner = new Scanner(System.in)) {
		// Try Catch Block
		try{
			System.out.print("Enter the loan amount: ");
			double principle = scanner.nextDouble();
			System.out.print("Enter the interest rate: ");
			double rate = scanner.nextDouble();
			System.out.print("Enter the loan term (in years): ");
			double years = scanner.nextInt();
			//
			double interest = principle*rate*years;
			double total = principle + interest;
			double payment = total/years/12;
			//
			DecimalFormat df = new DecimalFormat("0.##");
			System.out.println("Monthly payment: $" + df.format(payment));
		}catch(Exception exc){
			System.out.println(exc);
		}finally{
			// Housekeeping
			scanner.close();
		}
	}
}

