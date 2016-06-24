package bucky;

public class GUIFortySevenMain {
	public static void main(String[] args){
		// Variables
		Thread threadOne = new Thread(new GUIFortySeven("One"));
		Thread threadTwo = new Thread(new GUIFortySeven("Two"));
		Thread threadThree = new Thread(new GUIFortySeven("Three"));
		Thread threadFour = new Thread(new GUIFortySeven("Four"));
		// Start the threads, which calls the run method
		threadOne.start();
		threadTwo.start();
		threadThree.start();
		threadFour.start();
	}
}
