package bucky;

import javax.swing.JFrame;

public class GUISixtyEightServerMain {
	public static void main(String[] args){
		// Variables
		GUISixtyEightServer server = new GUISixtyEightServer();
		server.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		server.startRunning();
	}
}
