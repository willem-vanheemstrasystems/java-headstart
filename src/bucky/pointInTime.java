package bucky;

public class pointInTime {
	private int month;
	private int day;
	private int year;
	
	// Constructor
	public pointInTime(int m, int d, int y){
		month = m;
		day = d;
		year = y;
		
		System.out.printf("The constructor for this is %s\n", this);
	}

	// Method overwrite
	public String toString(){
		return String.format("%d/%d/%d", month, day, year);
	}
}
