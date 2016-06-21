package bucky;

public class GUITwentyMain {
	public static void main(String[] args){
		// Variables
		String a = "apples";
		String b = "beer";
		String c = "BEER";
		
		System.out.println(a.length());
		// String comparison
		if(a.equals("apples")){
			System.out.println("a matches apples");
		}
		// String comparison
		if(b.equalsIgnoreCase(c)){
			System.out.println("b matches c, when ignoring case");
		}
		
	}
}
