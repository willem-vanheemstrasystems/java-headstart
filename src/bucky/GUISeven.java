package bucky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUISeven extends JFrame {
	// Variables
	private JList list;
	private static String[] colorNames = {"black", "blue", "red", "white"};
	private static Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};
	// Constructor
	public GUISeven(){
		super("the Title");
		setLayout(new FlowLayout());
		// Create the list
		list = new JList(colorNames);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));
		
		list.addListSelectionListener(
			// Anonymous inner class
			new ListSelectionListener(){
				// Overwrite abstract method of ListSelectionListener
				public void valueChanged(ListSelectionEvent event){
					// Background is behind content pane
					getContentPane().setBackground(colors[list.getSelectedIndex()]);
				}
			}	
		);
	}
	
	
	
}