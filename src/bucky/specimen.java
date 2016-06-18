package bucky;

public class Specimen {
	private String name;
	private SpecimenType type;
	private PointInTime birthday;
	// Constructor
	public Specimen(String theName, SpecimenType theType, PointInTime theBirthday){
		name = theName;
		type = theType;
		birthday = theBirthday;
	}
	
	// Method overwrite
	public String toString(){
		return String.format("My name is %s, I am a %s and my birthday is %s.", name, type.toString().toLowerCase(), birthday);
	}
}
