package bucky;

public class ClubMain {
	public static void main(String[] args){
		Club member1 = new Club("Megan", "Fox");
		Club member2 = new Club("Natalie", "Portman");
		Club member3 = new Club("Taylor", "Swift");
		
		System.out.println(); // Empty line
		
		// Member 1
		System.out.println(member1.getFirst());
		System.out.println(member1.getLast());
		System.out.println(member1.getMembers());
		
		// Member 2
		System.out.println(member2.getFirst());
		System.out.println(member2.getLast());
		System.out.println(member2.getMembers());
		
		// Static methods & variables return on the Class itself too
		System.out.println(Club.getMembers());		
	}
}
