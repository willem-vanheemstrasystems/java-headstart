package bucky;

import java.util.*;

// Runnable interface contains run() method
public class GUIFortySix implements Runnable {
	// Variables
	String name;
	int time;
	Random random = new Random();
	// Constructor
	public GUIFortySix(String string){
		name = string;
		// Random sleep time in milliseconds
		// so here between 0 and 999 milliseconds (~ 1 second)
		time = random.nextInt(999);
	}
	// Overwrite Runnable's run method
	// This method gets called whenever you start the thread
	public void run(){
		try{
			System.out.printf("%s is sleeping for %d milliseconds", name, time);
			Thread.sleep(time);
			System.out.printf("%s is done sleeping\n", name);
		}
		catch(Exception e){
			// Do nothing
		}
	}
}
