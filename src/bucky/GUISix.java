package bucky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUISix extends JFrame {

	private JComboBox comboBox;
	private JLabel label;
	// Store of filenames
	private static String[] fileNames = {"image1.png", "image2.png"};
	// Store of actual pictures
	private Icon[] imageIcons = {new ImageIcon(getClass().getResource(fileNames[0])), new ImageIcon(getClass().getResource(fileNames[1]))};
	// Constructor
	public GUISix(){
		super("the Title");
		setLayout(new FlowLayout());
		// Combo box, fill with file names
		comboBox = new JComboBox(fileNames);
		comboBox.addItemListener(
			// Anonymous inner class declaration
			new ItemListener(){
				// Overwrite abstract method of ItemListener
				public void itemStateChanged(ItemEvent event){
					if(event.getStateChange()==ItemEvent.SELECTED)
						label.setIcon(imageIcons[comboBox.getSelectedIndex()]);
				}
			}
		);
		add(comboBox);
		label = new JLabel(imageIcons[0]); // Default
		add(label);
	}
}
