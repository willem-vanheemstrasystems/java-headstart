package bucky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUINineteen extends JPanel {
	// Overwrite abstract method of JPanel
	public void paintComponent(Graphics g){
		// Call the super class's paintComponent method
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		// Darw a line
		g.setColor(Color.BLUE);
		g.drawLine(10, 25, 200, 45);
		// Draw a rectangle
		g.setColor(Color.RED);
		g.drawRect(10, 55, 100, 30);
		// Draw an oval
		g.setColor(Color.GREEN);
		g.drawOval(10, 95, 100, 30);
		// Draw a 3D rectangle
		g.setColor(Color.ORANGE);
		g.fill3DRect(10, 160, 100, 50, true);
	}
}
