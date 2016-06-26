package bucky;

import java.awt.*;
import javax.swing.*;

public class GUIFortyDrawOval extends JPanel {
	// Variables
	private int diameter = 10;
	// Method
	public void paintComponent(Graphics g) {
		// Call super class's (i.e. JPanel) methods
		super.paintComponent(g);
		g.fillOval(10, 10, diameter, diameter);
		
	}
	// Method
	public void setDiameter(int newDiameter){
		// Diameter should be 0 or greater, 
		// else default to 10
		diameter = (newDiameter >= 0 ? newDiameter : 10);
		// Repaint, automatically calls the paintComponent method
		repaint();
	}
	// Method
	public Dimension getPreferredSize(){
		return new Dimension(200, 200);
	}
	// Method
	public Dimension getMinimumSize(){
		return getPreferredSize();
	}
}
