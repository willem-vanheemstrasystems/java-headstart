package bucky;

public class AnimalMain {
	public static void main(String[] args){
		AnimalList animalList = new AnimalList();
		Dog dog = new Dog();
		Fish fish = new Fish();
		// Add animals to the list array
		animalList.add(dog);
		animalList.add(fish);
	}
}
