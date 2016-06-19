package bucky;

public class Adder {
	// Variables
	private int sum;
	private final int NUMBER; // Final means immutable

	// Constructor
	public Adder(int x){
		NUMBER = x;
	}
	
	// Method
	public void add(){
		sum+=NUMBER; // Adds NUMBER to sum and updates sum
	}
	
	// Method overwrite
	public String toString(){
		return String.format("sum = %d\n", sum);
	}
}
