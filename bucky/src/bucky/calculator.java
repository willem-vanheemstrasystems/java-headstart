package bucky;

import java.util.Scanner;

/* 
 * Calculator
 */
class calculator {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first num: ");
		fnum = input.nextDouble();
		System.out.println("Enter second num: ");
		snum = input.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}
}
