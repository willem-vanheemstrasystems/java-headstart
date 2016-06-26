package bucky;

import java.util.Random;

public class randomizer {
	public static void main(String[] args){
		Random dice = new Random();
		int number;
		for(int counter=1;counter<=10;counter++){
			number = 1 + dice.nextInt(6); // 6 is number of options, add 1 as it starts with 0
			System.out.println(number);
		}
	}
}
