package bucky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIFive extends JFrame {
	// Variables
	private JTextField textField;
	private Font plainFont;
	private Font boldFont;
	private Font italicFont;
	private Font boldItalicFont;
	private JRadioButton plainRadioButton;
	private JRadioButton boldRadioButton;
	private JRadioButton italicRadioButton;
	private JRadioButton boldItalicRadioButton;
	private ButtonGroup buttonGroup;
	// Constructor
	public GUIFive(){
		super("the Title");
		setLayout(new FlowLayout());
		// Text field
		textField = new JTextField("Some text", 25);
		add(textField);
		// Radio button - plain
		plainRadioButton = new JRadioButton("plain", true);
		add(plainRadioButton);
		// Radio button - bold
		boldRadioButton = new JRadioButton("bold", false);
		add(boldRadioButton);
		// Radio button - italic
		italicRadioButton = new JRadioButton("italic", false);
		add(italicRadioButton);
		// Radio button - bold & italic
		boldItalicRadioButton = new JRadioButton("bold & italic", false);
		add(boldItalicRadioButton);
		// Button group
		buttonGroup = new ButtonGroup();
		buttonGroup.add(plainRadioButton);
		buttonGroup.add(boldRadioButton);
		buttonGroup.add(italicRadioButton);
		buttonGroup.add(boldItalicRadioButton);
		// Fonts
		plainFont = new Font("Serif", Font.PLAIN, 14);
		boldFont = new Font("Serif", Font.BOLD, 14);
		italicFont = new Font("Serif", Font.ITALIC, 14);
		boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		// Set default font for text field
		textField.setFont(plainFont);
		// Listeners
		plainRadioButton.addItemListener(new HandlerClass(plainFont));
		boldRadioButton.addItemListener(new HandlerClass(boldFont));
		italicRadioButton.addItemListener(new HandlerClass(italicFont));
		boldItalicRadioButton.addItemListener(new HandlerClass(boldItalicFont));
	}
	private class HandlerClass implements ItemListener {
		private Font font;
		// Constructor
		public HandlerClass(Font f){
			font = f;
			
		}
		// Overwrite abstract method of ItemListener
		public void itemStateChanged(ItemEvent event){
			textField.setFont(font);
		}
	}
}
