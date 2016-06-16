package bucky;

import java.util.Scanner;

class apples {
	public static void main(String args[]) {
		// System.out.println("Hello youtube!");
		double tuna;
		tuna = 5.28;
		// System.out.print(tuna);
		/* 
		 * Calculator
		 */
		Scanner bucky = new Scanner(System.in);
		double fnum, snum, answer;
		// System.out.println(bucky.nextLine());
		System.out.println("Enter first num: ");
		fnum = bucky.nextDouble();
		System.out.println("Enter second num: ");
		snum = bucky.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}
}
