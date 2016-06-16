package bucky;

public class compounder {
	public static void main(String[] args){
		/*
		 * A = Amount
		 * P = Principle
		 * R = Rate
		 * n = number of years
		 * A=P(1+R)^n
		 */
		double amount;
		double principal = 10000;
		double rate = .01;
		for(int year=1;year<=20;year++){
			amount = principal*Math.pow(1+rate, year);
			System.out.println(year + "  " + amount);
		}
	}
}
