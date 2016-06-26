package bucky;

public class averager {
	public static void main(String[] args) {
		System.out.println(average(43,56,76,8));
	}
	public static int average(int...numbers) { // ... means an unknown number of input values
		int total=0;
		for(int x:numbers) // enhanced for loop
			total+=x; // adds x to total, total becomes new total
		
		return total/numbers.length;
	}
}
