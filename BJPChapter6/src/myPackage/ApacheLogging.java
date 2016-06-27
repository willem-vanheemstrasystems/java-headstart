/**
 * 
 */
package myPackage;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * This class uses Apache Log4j 2
 * Download it from
 * http://logging.apache.org/log4j/2.x/index.html
 * Extract the zip file and add the following jar files to the Referenced Libraries
 * - log4j-api-2.x.x.jar
 * - log4j-core-2.x.x.jar
 * Create a log4j2.xml file in the src directory
 * and hit refresh in Eclipse project view and then it works.
 */
public class ApacheLogging {
	// Class variable
	static final Logger logger = LogManager.getLogger(ApacheLogging.class.getName());
	// Method main
	public static void main(String[] args) {
		// Variables
		int age = 30;
		double retirementFund = 10000;
		int yearsInRetirement = 20;
		String name = "David Johnson";
		// For loop
		for(int i = age; i<=65; i++ ){
			recalculate(retirementFund, 0.1);
		}
		double monthlyPension = retirementFund / yearsInRetirement / 12;
		System.out.println(name + " will have $" + monthlyPension + " per month for retirement.");
		if(monthlyPension < 100){
			// System.out.println("monthlyPension is too low.");
			logger.fatal("monthlyPension is too low.");
		}
		// Create some messages to test the different levels of the logger
		logger.trace("finely detailed TRACE message");
		logger.debug("detailed DEBUG message");
		logger.info("informational message");
		logger.warn("warning message");
		logger.error("error message");
		logger.fatal("fatal message");
	}
	// Method recalculate
	public static void recalculate(double fundAmount, double rate){
		logger.entry();
		fundAmount = fundAmount * (1 + rate);
		logger.info("fundAmount = " + fundAmount);
		logger.exit();
	} 
}
