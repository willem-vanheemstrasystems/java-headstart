package bucky;

public class specimen {
	private String name;
	private String type;
	private pointInTime birthday;
	
	// Constructor
	public specimen(String theName, String theType, pointInTime theBirthday){
		name = theName;
		type = theType;
		birthday = theBirthday;
	}
	
	// Method overwrite
	public String toString(){
		return String.format("My name is %s, I am a %s and my birthday is %s.", name, type, birthday);
	}
}
