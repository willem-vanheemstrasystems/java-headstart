package bucky;

import java.util.*;

public class GUIFifteenMain {
	public static void main(String[] args){
		// Variables
		Scanner input = new Scanner(System.in);
		boolean repeat = true;
		
		do{
			try{
				System.out.println("Enter first number: ");
				int firstNumber = input.nextInt();
				
				System.out.println("Enter second number: ");
				int secondNumber = input.nextInt();
				
				int division = firstNumber/secondNumber;
				System.out.println("Division is: " + division);
				// Prevent a repeat
				repeat = false;
			}
			catch(Exception e){
				System.out.println("An exception occured: " + e);
			}
		}while(repeat);
	}
}
