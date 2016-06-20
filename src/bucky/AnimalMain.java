package bucky;

public class AnimalMain {
	public static void main(String[] args){
		AnimalList animalList = new AnimalList();
		Dog dog = new Dog();
		Fish fish = new Fish();
		// Add animals to the list array
		animalList.add(dog);
		animalList.add(fish);
		
		Animal[] theList = new Animal[2];
		theList[0] = dog;
		theList[1] = fish;
		// Enhanced for loop
		for(Animal x: theList){
			// Make some noise
			x.noise();
		}
	}
}
