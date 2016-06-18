package bucky;

public class specimen {
	private String name;
	private pointInTime birthday;
	
	// Constructor
	public specimen(String theName, pointInTime theBirthday){
		name = theName;
		birthday = theBirthday;
	}
	
	// Method overwrite
	public String toString(){
		return String.format("My name is %s, my birthday is %s", name, birthday);
	}
}
