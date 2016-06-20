package bucky;

public class DogList {
	private Dog[] thelist = new Dog[5];
	private int i=0;
	
	// Method
	public void add(Dog d){
		if(i<thelist.length){
			// Add a Dog object to the list array
			thelist[i] = d;
			System.out.println("Dog added at index "+i);
			i++;
		}
	}
}
