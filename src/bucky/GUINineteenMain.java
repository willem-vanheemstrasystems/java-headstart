package bucky;

import java.awt.*;
import javax.swing.*;

public class GUINineteenMain {
	public static void main(String[] args){
		// Variables
		JFrame frame = new JFrame("Title");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Instantiate GUI 
		GUINineteen guiNineteen = new GUINineteen();
		guiNineteen.setBackground(Color.WHITE);
		frame.add(guiNineteen);
		frame.setSize(500, 270);
		frame.setVisible(true);
	}
}
