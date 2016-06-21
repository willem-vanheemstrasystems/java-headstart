package bucky;

public class GUITwentyOneMain {
	public static void main(String[] args){
		// Variables
		String[] words = {"funk","chunk","furry","baconator"};
		// startsWith, enhanced for loop
		for(String word : words){
			if(word.startsWith("fu"))
				System.out.println(word + " starts with fu");
		}
		// endsWith, enhanced for loop
		for(String word : words){
			if(word.endsWith("nk"))
				System.out.println(word + " ends with nk");
		}		
	}
}
