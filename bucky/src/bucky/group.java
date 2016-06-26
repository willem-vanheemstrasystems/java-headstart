package bucky;

import java.util.Scanner;

public class group {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name:");
		person personObject = new person();
		String name = input.nextLine();
		personObject.setName(name);
		name = personObject.getName();
		System.out.printf("Our group consists of %s", name);
		System.out.println();
		personObject.sayHello();
	}
}
