package bucky;

public class Fatty {
	// Uses a Food object as input, 
	// but will accept subclasses of Food 
	// such as Tomato and Pineapple
	// too! Thanks to polymorphism.
	public void digest(Food x){
		// Call the Food's eat method
		x.eat();
	}
	
	public void scrape(Food y){
		// Call the Food's peel method
		y.peel();
	}

}
