package bucky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUISeventeen extends JPanel {
    // Inherited method
	public void paintComponent(Graphics g){
		// Call the super class's paintComponent method
		super.paintComponent(g);
		// this = this instance
		this.setBackground(Color.WHITE);
		// Set color to draw with
		g.setColor(Color.BLUE);
		// Draw a rectangle
		g.fillRect(25, 25, 100, 30);
		// Set color to draw with RGB values
		g.setColor(new Color(190,81,215));
		// Draw another rectangle
		g.fillRect(25, 65, 100, 30);
		// Set color to draw with
		g.setColor(Color.RED);
		// Draw a text
		g.drawString("This is some text", 25, 120);
	}
}
