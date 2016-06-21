package bucky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUINine extends JFrame {
	// Variables
	private JPanel mousePanel;
	private JLabel statusBar;
	// Constructor
	public GUINine() {
		super("the Title");
		// Mouse panel
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.WHITE);
		add(mousePanel, BorderLayout.CENTER); // Positioned in the center of the screen
		// Status bar
		statusBar = new JLabel("default");
		add(statusBar, BorderLayout.SOUTH); // Positioned at the bottom of the screen
		// The handler
		HandlerClass handler = new HandlerClass();
		// The listeners
		mousePanel.addMouseListener(handler); // whilst still
		mousePanel.addMouseMotionListener(handler); // whilst moving
	}
	private class HandlerClass implements MouseListener, MouseMotionListener {
		// Overwrite abstract method mouseClicked() of MouseListener
		public void mouseClicked(MouseEvent event){
			// Show coordinates
			statusBar.setText(String.format("Mouse clicked at %d,%d", event.getX(), event.getY()));
		}
		// Overwrite abstract method mousePressed() of MouseListener
		public void mousePressed(MouseEvent event){
			statusBar.setText("Mouse pressed");
		}
		// Overwrite abstract method mouseReleased() of MouseListener
		public void mouseReleased(MouseEvent event){
			statusBar.setText("Mouse released");
		}
		// Overwrite abstract method mouseEntered() of MouseListener
		public void mouseEntered(MouseEvent event){
			statusBar.setText("Mouse entered");
			mousePanel.setBackground(Color.RED);
		}
		// Overwrite abstract method mouseExited() of MouseListener
		public void mouseExited(MouseEvent event){
			statusBar.setText("Mouse exited");
			mousePanel.setBackground(Color.WHITE);
		}
		// Overwrite abstract method mouseDragged() of MouseMotionListener
		public void mouseDragged(MouseEvent event){
			statusBar.setText("Mouse dragged");
		}
		// Overwrite abstract method mouseMoved() of MouseMotionListener
		public void mouseMoved(MouseEvent event){
			statusBar.setText("Mouse moved");
		}		
	}
}
