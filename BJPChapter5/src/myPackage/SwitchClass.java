/**
 * 
 */
package myPackage;
/**
 * @author user
 *
 */
public class SwitchClass {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String loanType = "Commercial";
		double interestRate;
		switch(loanType){
			case "Residential": 
				interestRate = 0.055;
				break;
			case "Commercial":
				interestRate = 0.062;
				break;
			case "Investment":
				interestRate = 0.059;
				break;
			default:
				interestRate = 0;
		}
		System.out.println(loanType + " loans have an annual interest rate of " + interestRate*100 + "%.");
	}
}
