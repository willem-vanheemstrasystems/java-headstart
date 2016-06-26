package bucky;

import javax.swing.JFrame;

public class GUISeventyEightClientMain {
	public static void main(String[] args){
		// Variables
		// Using local server
		GUISeventyEightClient client = new GUISeventyEightClient("127.0.0.1");
		client.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		client.startRunning();
	}
}
