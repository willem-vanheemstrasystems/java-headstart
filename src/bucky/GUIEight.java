package bucky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUIEight extends JFrame{
	// Variables
	private JList leftList;
	private JList rightList;
	private JButton moveButton;
	private static String[] foods = {"apple", "sandwich", "milk", "omelet", "chocolate"};
	// Constructor
	public GUIEight(){
		super("the Title");
		setLayout(new FlowLayout());
		// Left list
		leftList = new JList(foods);
		leftList.setVisibleRowCount(3);
		leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftList));
		// Move button
		moveButton = new JButton("Move -->");
		moveButton.addActionListener(
			new ActionListener(){
				// Overwrite abstract method of ActionListener
				public void actionPerformed(ActionEvent event){
					// Create the right list based on the values from the left list
					rightList.setListData(leftList.getSelectedValuesList().toArray());
				}
			}
		);
		add(moveButton);
		// Right list
		rightList = new JList(); // Empty for now
		rightList.setVisibleRowCount(3);
		rightList.setFixedCellWidth(100);
		rightList.setFixedCellHeight(15);
		rightList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightList));
	}
}
