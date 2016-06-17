package bucky;

public class timecalculatormain {
	public static void main(String[] args){
		timecalculator timecalculatorObject = new timecalculator();
		System.out.println(timecalculatorObject.toMilitary());
		timecalculatorObject.setTime(13, 27, 6);
		System.out.println(timecalculatorObject.toMilitary());
		System.out.println(timecalculatorObject.toNormal());
	}
}
