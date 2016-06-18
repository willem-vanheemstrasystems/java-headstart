package bucky;

public class timeCalculatorMain {
	public static void main(String[] args){
		timeCalculator timeCalculatorObject = new timeCalculator();
		System.out.println(timeCalculatorObject.toMilitary());
		timeCalculatorObject.setTime(13, 27, 6);
		System.out.println(timeCalculatorObject.toMilitary());
		System.out.println(timeCalculatorObject.toNormal());
	}
}
