package bucky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUISixteen extends JFrame {
	// Variables
	private JButton leftButton;
	private JButton centerButton;
	private JButton rightButton;
	private FlowLayout flowLayout;
	private Container container;
	// Constructor
	public GUISixteen(){
		super("the Title");
		// Create a window
		flowLayout = new FlowLayout();
		container = getContentPane();
		setLayout(flowLayout);
		// Add left button
		leftButton = new JButton("left");
		add(leftButton);
		leftButton.addActionListener(
			// An anonymous inner class
			new ActionListener(){
				// Overwrite abstract method of ActionListener
				public void actionPerformed(ActionEvent event){
					// Change the layout
					flowLayout.setAlignment(FlowLayout.LEFT);
					flowLayout.layoutContainer(container);
				}
			}
		);
		// Add center button
		centerButton = new JButton("center");
		add(centerButton);
		centerButton.addActionListener(
			// An anonymous inner class
			new ActionListener(){
				// Overwrite abstract method of ActionListener
				public void actionPerformed(ActionEvent event){
					// Change the layout
					flowLayout.setAlignment(FlowLayout.CENTER);
					flowLayout.layoutContainer(container);
				}
			}
		);
		// Add right button
		rightButton = new JButton("right");
		add(rightButton);
		rightButton.addActionListener(
			// An anonymous inner class
			new ActionListener(){
				// Overwrite abstract method of ActionListener
				public void actionPerformed(ActionEvent event){
					// Change the layout
					flowLayout.setAlignment(FlowLayout.RIGHT);
					flowLayout.layoutContainer(container);
				}
			}
		);
	}
}
