/**
 * 
 */
package myPackage;

import java.io.IOException;
import java.util.logging.*;

/**
 * @author user
 *
 */
public class LoggerExample {
	// Create a Logger instance
	private final static Logger logger =
			Logger.getLogger(LoggerExample.class.getName());
	// Create a file handler for fine messages and above
	private static FileHandler finerhandler = null;
	// Create a file handler only for config messages and above
	private static FileHandler warninghandler = null;
	// Method 
	public static void logIt(){
		try{
			finerhandler = new FileHandler("src/loggerExample_finer.log", false);
			warninghandler = new FileHandler("src/loggerExample_config.log", false);
		}catch(SecurityException | IOException e){
			e.printStackTrace();
		}
		// Attach a basic formatter and set the level
		finerhandler.setFormatter(new SimpleFormatter());
		// This handler will print all messages to its log
		finerhandler.setLevel(Level.FINER);
		// Attach a basic formatter and set the level
		warninghandler.setFormatter(new SimpleFormatter());
		// This handler will only print warning and severe messages to its logs
		warninghandler.setLevel(Level.CONFIG);
		// Attach the handlers
		logger.addHandler(finerhandler);
		logger.addHandler(warninghandler);
		// Set the level to FINEST
		// (log ALL messages)
		logger.setLevel(Level.FINER);
	}
	// Main method
	public static void main(String[] args) {
		// Set up the logger using the logIt() static method above
		// without this, only the default console handler will log
		// with this, the handlers created above will log
		LoggerExample.logIt();
		// Variables
		int age = 30;
		double retirementFund = 10000;
		int yearsInRetirement = 20;
		String name = "David Johnson";
		// For loop
		for(int i = age; i<=65; i++){
			recalculate(retirementFund, 0.1);
		}
		double monthlyPension = retirementFund / yearsInRetirement / 12;
		System.out.println(name + " will have $" + monthlyPension + " per month for retirement.");
		if(monthlyPension < 100){
			// Create a log entry (level: SEVERE) indicating a 
			// problem with the calculation
			logger.log(Level.SEVERE, "monthlyPension is too low.");
		}
		// Create a series of log entries to show which
		// levels are printed to which handler's log
		logger.log(Level.FINEST, "finest detailed message");
		logger.log(Level.FINER, "finer detailed message");		
		logger.log(Level.FINE, "fine detailed message");
		logger.log(Level.CONFIG, "configuration message");		
		logger.log(Level.INFO, "informational message");		
		logger.log(Level.WARNING, "warning message");
		logger.log(Level.SEVERE, "severe message");
	}
	// Method
	public static void recalculate(double fundAmount, double rate){
		// Create a log entry (level: FINER) indicating the method entry
		logger.entering("LoggerExample","recalculate");
		fundAmount = fundAmount * (1 + rate);
		// Create a log entry (level: INFO) indicating
		// the current value of fundAmount
		logger.log(Level.INFO, "fundAmount = " + fundAmount);
		// Create a log entry (level: FINER) indicating the method return
		logger.exiting("LoggerExample", "recalculate");
	}
}
