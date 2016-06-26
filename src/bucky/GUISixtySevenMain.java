package bucky;

import javax.swing.JFrame;

public class GUISixtySevenMain {
	public static void main(String[] args){
		// Variables
		GUISixtySevenServer server = new GUISixtySevenServer();
		server.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		server.startRunning();
	}
}
