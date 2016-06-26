package bucky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIFour extends JFrame {
	private JTextField textField;
	private JCheckBox boldCheckBox;
	private JCheckBox italicCheckBox;
	
	// Constructor
	public GUIFour(){
		// Create GUI
		super("the Title");
		setLayout(new FlowLayout());
		// TextField
		textField = new JTextField("This is a sentence", 20);
		textField.setFont(new Font("Serif", Font.PLAIN, 14));
		add(textField);
		// CheckBox bold
		boldCheckBox = new JCheckBox("bold");
		add(boldCheckBox);
		// CheckBox italic
		italicCheckBox = new JCheckBox("italic");
		add(italicCheckBox);		
		// Instantiate a handler
		HandlerClass handler = new HandlerClass();
		boldCheckBox.addItemListener(handler);
		italicCheckBox.addItemListener(handler);
	}
	private class HandlerClass implements ItemListener{
		// Overwrite abstract method of ItemListener
		public void itemStateChanged(ItemEvent event){
			// Instantiate font
			Font font = null;
			if(boldCheckBox.isSelected() && italicCheckBox.isSelected())
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
			else if(boldCheckBox.isSelected())
				font = new Font("Serif", Font.BOLD, 14);
			else if(italicCheckBox.isSelected())
				font = new Font("Serif", Font.ITALIC, 14);
			else 
				font = new Font("Serif", Font.PLAIN, 14);
			textField.setFont(font);
		}
		
	}
}
