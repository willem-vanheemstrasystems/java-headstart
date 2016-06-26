package bucky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIEighteen extends JFrame {
	// Variables
	private JButton button;
	private Color color = (Color.WHITE);
	private JPanel panel;
	// Constructor
	public GUIEighteen(){
		super("the Title");
		panel = new JPanel();
		panel.setBackground(color);
		button = new JButton("Choose a color");
		button.addActionListener(
			// Anonymous inner class
			new ActionListener(){
				// Overwrite abstract method of ActionListener
				public void actionPerformed(ActionEvent event){
					// Create color chooser, starts with previous color
					color = JColorChooser.showDialog(null, "Pick your color", color);
					if(color==null) // No color picked
						color=(Color.WHITE);
					panel.setBackground(color);
				}
			}
		);
		// Add all
		add(panel, BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);
		setSize(425, 150);
		setVisible(true);
	}
}
