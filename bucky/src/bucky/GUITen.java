package bucky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUITen extends JFrame {
	// Variables
	private String details;
	private JLabel statusBar;
	// Constructor
	public GUITen(){
		super("the Title");
		// Status bar
		statusBar = new JLabel("default");
		add(statusBar, BorderLayout.SOUTH);
		// Mouse listener
		addMouseListener(new MouseClass());
		
	}
	/*
	 * When you inherit (i.e. implement) from an adapter class
	 * you only have to overwrite the methods that you use.
	 */
	private class MouseClass extends MouseAdapter {
		// Overwrite abstract method mouseClicked of MouseListener
		public void mouseClicked(MouseEvent event){
			details = String.format("You clicked %d times", event.getClickCount());
			// Detect mouse button
			if(event.isMetaDown())
				details += " with right mouse button";
			else if(event.isAltDown())
				details += " with center mouse button";
			else
				details += " with left mouse button";
			statusBar.setText(details);
		}
	}
}
