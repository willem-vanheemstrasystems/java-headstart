package bucky;

public class FoodMain {
	
	// Main method
	public static void main(String[] args){
		Tomato tomato = new Tomato(); // Tomato inherits from Food
		tomato.eat(); // An inherited method
		Pineapple pineapple = new Pineapple(); // Pineapple inherits from Food
		pineapple.eat(); // An inherited method	
		
		// Polymorphism; super and sub classes can be combined
		Food yummies[] = new Food[2];
		yummies[0] = new Tomato();
		yummies[1] = new Pineapple();
		
		// Loop through polymorphic array
		for(int x=0; x<2; x++){
			yummies[x].eat();
		}
		
	}
}
