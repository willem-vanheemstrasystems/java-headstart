package bucky;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GUIThree extends JFrame {
	private JButton reg;
	private JButton custom;
	// Constructor
	public GUIThree(){
		super("The Title"); // Set the title of the super class, JFrame
		setLayout(new FlowLayout());
		// Regular button
		reg = new JButton("reg Button");
		add(reg);
		// Custom button
		Icon image1 = new ImageIcon(getClass().getResource("image1.png"));
		Icon image2 = new ImageIcon(getClass().getResource("image2.png"));
		custom = new JButton("Custom", image1);
		custom.setRolloverIcon(image2);
		add(custom);
		// Attach handler
		HandlerClass handler = new HandlerClass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);	
	}
	private class HandlerClass implements ActionListener {
		// Overwrite abstract method of ActionListener
		public void actionPerformed(ActionEvent event){
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
		}
	}
}
