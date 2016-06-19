package bucky;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

// Inherits from JFrame
public class GUITwo extends JFrame{
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;
	
	// Constructor
	public GUITwo(){
		// Create the window
		super("The Title");
		setLayout(new FlowLayout());
		// Fields
		item1 = new JTextField(10); // 10 characters long
		add(item1);

		item2 = new JTextField("enter text here"); // Placeholder text
		add(item2);
		
		item3 = new JTextField("uneditable", 20); // 20 characters long, uneditable
		item3.setEditable(false);
		add(item3);
		
		passwordField = new JPasswordField("mypass");
		add(passwordField);
		
		// Event handler
		TheHandler handler = new TheHandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);		
		item3.addActionListener(handler);		
		passwordField.addActionListener(handler);
	}
	// Class that handles the events
	private class TheHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			String string = "";
			
			if(event.getSource()==item1)
				// Set string to input of field 1 text box
				string = String.format("field 1: %s", event.getActionCommand());
			else if(event.getSource()==item2)
				// Set string to input of field 2 text box
				string = String.format("field 2: %s", event.getActionCommand());
			else if(event.getSource()==item3)
				// Set string to input of field 3 text box
				string = String.format("field 3: %s", event.getActionCommand());
			else if(event.getSource()==passwordField)
				// Set string to input of password field text box
				string = String.format("passwordfield: %s", event.getActionCommand());
			// Show empty window - null positions the window in the center
			JOptionPane.showMessageDialog(null, string);
		}
	}
	
}
