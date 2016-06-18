package bucky;

public class SpecimenMain {
	public static void main(String[] args){
		SpecimenType fish = null;
		SpecimenType turtle = null;
		String name = "";
		PointInTime birthday = null;
		Specimen character = null;
		
		System.out.println("Type\tCategory\tLegged?");
		for(SpecimenType type: SpecimenType.values()) {
			System.out.printf("%s\t%s\t%s\n", type, type.getCategory(), type.isLegged());
			switch(type){
				case FISH:
					fish = type;
					break;
				case TURTLE:
					turtle = type;
					break;
				default:
			}
		}
		
		// Create a character
		name = "Dory";
		birthday = new PointInTime(4,15,2016);
		character = new Specimen(name, fish, birthday);
		System.out.println(character);
		
		// Create another character
		name = "Crush";
		birthday = new PointInTime(6,10,2011);
		character = new Specimen(name, turtle, birthday);
		System.out.println(character);		
	}
}
