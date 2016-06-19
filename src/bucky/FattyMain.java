package bucky;

public class FattyMain {
	public static void main(String[] args){
		Fatty fatboy = new Fatty();
		Food snack = new Food();
		
		// Call Fatty instance
		fatboy.digest(snack);
	}
}
