package bucky;

import javax.swing.JFrame;

public class GUISevenMain {
	public static void main(String[] args){
		GUISeven guiSeven = new GUISeven();
		guiSeven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiSeven.setSize(300, 200);
		guiSeven.setVisible(true);
	}
}