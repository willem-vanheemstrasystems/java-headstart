package bucky;

public class Club {
	private String first;
	private String last;
	private static int members = 0; // static variable
	
	// Constructor
	public Club(String fn, String ln){
		first = fn;
		last = ln;
		members++; // Increases for each added member
		System.out.printf("Constructor for %s %s, members in the club: %d.\n", first, last, members);
	}
}
