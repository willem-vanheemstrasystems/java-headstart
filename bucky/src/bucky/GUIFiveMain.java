package bucky;

import javax.swing.JFrame;

public class GUIFiveMain {
	public static void main(String[] args){
		GUIFive guiFive = new GUIFive();
		guiFive.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFive.setSize(300, 200);
		guiFive.setVisible(true);
	}
}