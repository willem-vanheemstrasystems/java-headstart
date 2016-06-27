/**
 * 
 */
package myPackage;

import java.math.BigDecimal;
/**
 * @author user
 *
 */
public class BigDecimalCalculator {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// System.out.println("100 at 10% annual interest is: " + recalculate(100, 0.1));

		int age = 30;
		BigDecimal retirementFund = new BigDecimal("10000.00");
		// Set the scale to two decimal points
		// and the rounding to round up when the next digit is >= 5
		retirementFund.setScale(2, BigDecimal.ROUND_HALF_UP);
		BigDecimal yearsInRetirement = new BigDecimal("20.00");
		String name = "David Johnson";
		for(int i = age; i<=65; i++){
			retirementFund = recalculate(retirementFund, new BigDecimal("0.10"));
		}
		BigDecimal monthlyPension = retirementFund.divide(yearsInRetirement.multiply(new BigDecimal("12")),2,BigDecimal.ROUND_HALF_UP);
		/**
		 * OLD
		 * // Create a decimal format with two decimal points
		 * DecimalFormat df = new DecimalFormat("0.##");
		 * // Use the df.format() method to format the double
		 * System.out.println(name + " will have $" + df.format(monthlyPension) + " per month for retirement.");
		 */
		System.out.println(name + " will have $" + monthlyPension + " per month for retirement.");
	}
	public static BigDecimal recalculate(BigDecimal fundAmount, BigDecimal rate){
		// Use BigDecimal methods for arithmetic operations
		return fundAmount.multiply(rate.add(new BigDecimal("1.00")));
	}
}
