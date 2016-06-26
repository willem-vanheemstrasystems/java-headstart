package myPackage;

public class EnhancedForLoop {
	/**
	 * EnhancedForLoop
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tenIntegers = {1,2,3,4,5,6,7,8,9,10};
		for (int i : tenIntegers){
			int doubled = i * 2;
			System.out.println(i + " times two equals " + doubled);
		}
		System.out.println("End of program");
	}
}
