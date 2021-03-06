package bucky;
// No instances can be created from an abstract class
// only subclass instances
abstract public class Food {
	
	// Method that can be inherited
	public void eat(){
		System.out.println("I am the eat method.");
	}
	
	// Abtract method, means it must be overwritten
	public abstract void peel();
	
	// Method that cannot be inherited, as it is private
	private void juice(){
		System.out.println("I am the juice method.");
	}
}
