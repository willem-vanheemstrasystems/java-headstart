package bucky;

public class person {
	private String personName;
	
	// A constructor has the same name as the class
	public void person(String name){
		personName = name;
	}
	
	// If a method does not return anything, use void
	public void setName(String name){
		personName = name;
	}
	public String getName(){
		return personName;
	}
	public void sayHello(){
		System.out.printf("Hi, my name is %s", getName());
	}
}
