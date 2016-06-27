/**
 * 
 */
package myPackage;

/**
 * @author user
 *
 */
public class TryCatchExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Variables
		int age = 30;
		int retirementFund = 10000;
		int yearsInRetirement = 0;
		String name = "David Johnson";
		// For loop
		for(int i = age; i <= 65; i++){
			recalculate(retirementFund, 0.1);
		}
		try{
			double monthlyPension = retirementFund/yearsInRetirement/12;
			System.out.println(name + " will have $" + monthlyPension + " per month for retirement.");
		}catch(ArithmeticException ae){
			System.out.println(ae);
			System.exit(0);
		}finally{
			System.out.println("Finally was reached.");
		}
	}
	// Method
	public static void recalculate(double fundAmount, double rate){
		fundAmount = fundAmount*(1+rate);
	}
}
