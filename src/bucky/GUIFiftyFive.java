package bucky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUIFiftyFive extends JFrame {
	// Variables
	private JTextField addressBar;
	private JEditorPane display;
	// Constructor
	public GUIFiftyFive(){
		super("the Title");
		// Create address bar
		addressBar = new JTextField("Enter a URL");
		// Capture on press enter event
		addressBar.addActionListener(
			// Anonymous inner class
			new ActionListener(){
				public void actionPerformed(ActionEvent event){
					// Pass URL to loadPage method
					loadPage(event.getActionCommand());
				}
			}
		);
	}
}
