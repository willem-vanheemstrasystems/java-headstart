package bucky;

import javax.swing.JFrame;

public class GUIThreeMain {
	public static void main(String[] args){
		// Instantiate the GUI
		GUIThree guiThree = new GUIThree();
		guiThree.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiThree.setSize(300, 200);
		guiThree.setVisible(true);
		
	}
}
