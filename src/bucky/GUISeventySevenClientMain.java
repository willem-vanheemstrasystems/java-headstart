package bucky;

import javax.swing.JFrame;

public class GUISeventySevenClientMain {
	public static void main(String[] args){
		// Variables
		// Using local server
		GUISeventySevenClient client = new GUISeventySevenClient("127.0.0.1");
		client.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		client.startRunning();
	}
}
