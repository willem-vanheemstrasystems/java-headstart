package bucky;

import java.util.Scanner;

public class apples {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int girls, boys, people;
		girls = 6;
		boys = 3;
		people = girls + boys;
		System.out.println(people);
		
		int tuna = 5;
		int bass = 18;
		++tuna; // pre-increment by 1; increments, then uses
		System.out.println(tuna);
		tuna++; // post-increment by 1; uses, then increments
		System.out.println(tuna);
		tuna += 8; // adds 8 to current value of tuna
		System.out.println(tuna);
		
		// Using another class, called tuna
		System.out.println("Enter your name:");
		String name = input.nextLine();
		tuna tunaObject = new tuna();
		tunaObject.simpleMessage(name);
	}
}
