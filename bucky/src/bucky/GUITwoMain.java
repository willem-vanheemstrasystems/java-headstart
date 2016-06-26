package bucky;
// Allow to use windows
import javax.swing.JFrame;

public class GUITwoMain {
	public static void main(String[] args){
		GUITwo guiTwo = new GUITwo();
		// Exit the program on exit
		guiTwo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set window size
		guiTwo.setSize(350,100);
		guiTwo.setVisible(true);
	}
}
