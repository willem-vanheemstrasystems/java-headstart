package bucky;

// Inherits from Food
public class Tomato extends Food {
	
	// Method that overwrites the inherited method
	public void eat(){
		System.out.println("I am the eat method of tomato.");
	}
	
	// Method that MUST overwrite abstract inherited method
	public void peel(){
		System.out.println("I am the peel method of tomato.");
	}
}
