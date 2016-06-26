package bucky;

public class GUITwentyThreeMain {
	public static void main(String[] args){
		System.out.println(factorial(5)); // Factorial of 5
		// Returns 120
	}
	
	// Method factorial (e.g. !5)
	// Note: 5 factorial is  5 x 4 x 3 x 2 x 1 = 120
	// Note: 0 factorial is 1
	public static long factorial(long number){
		if(number <= 1) // Base case 
			return 1;
		else
			// Recursion
			return number * factorial(number-1); // Calls itself
	}
}
