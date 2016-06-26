package bucky;

import javax.swing.JFrame;

public class GUISeventeenMain {
	public static void main(String[] args){
		JFrame frame = new JFrame("the Title");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GUISeventeen guiSeventeen = new GUISeventeen();
		frame.add(guiSeventeen);
		frame.setSize(400, 250);
		frame.setVisible(true);
	}
}
