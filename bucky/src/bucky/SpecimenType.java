package bucky;

public enum SpecimenType {
	
	// Constants
	FISH("mamal", false),    // Can be reached as SpecimenType.FISH
	TURTLE("mamal", true);
	
	// Variables
	private final String category;
	private final Boolean legged;
	
	// Constructor
	SpecimenType(String theCategory, Boolean isLegged){
		this.category = theCategory;
		this.legged = isLegged;
	}
	
	// Method
	public String getCategory(){
		return category;
	}
	
	// Method
	public Boolean isLegged(){
		return legged;
	}
	
	
}
