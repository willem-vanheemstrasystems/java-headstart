package bucky;

public class FattyMain {
	public static void main(String[] args){
		Fatty fatboy = new Fatty();
		// Always choose the superclass as the datatype
		//Food snack = new Food(); // Food is an abstract class, cannot be instantiated
		Food vegetable = new Tomato();
		Food fruit = new Pineapple();
		
		// Call Fatty instance
		//fatboy.digest(snack); // Food is an abstract class, cannot be instantiated
		fatboy.digest(vegetable);
		fatboy.digest(fruit);
		
	}
}
