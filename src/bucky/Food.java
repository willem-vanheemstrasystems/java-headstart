package bucky;

public class Food {
	
	// Method that can be inherited
	public void eat(){
		System.out.println("I am the eat method.");
	}
	
	// Method that cannot be inherited, as it is private
	private void juice(){
		System.out.println("I am the juice method.");
	}
}
