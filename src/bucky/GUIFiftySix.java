package bucky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUIFiftySix extends JFrame {
	// Variables
	private JTextField addressBar;
	private JEditorPane display;
	// Constructor
	public GUIFiftySix(){
		super("the Title");
		// Create address bar
		addressBar = new JTextField("Enter a URL");
		// Capture on press enter event
		addressBar.addActionListener(
			// Anonymous inner class
			new ActionListener(){
				// Overwrite method
				public void actionPerformed(ActionEvent event){
					// Pass URL to loadPage method
					loadPage(event.getActionCommand());
				}
			}
		);
		add(addressBar, BorderLayout.NORTH);
		// Create display
		display = new JEditorPane();
		display.setEditable(false);
		// Make links respond to click
		display.addHyperlinkListener(
			// Anonymous inner class
			new HyperlinkListener(){
				// Overwrite method
				public void hyperlinkUpdate(HyperlinkEvent event){
					// Act on clicks only
					if(event.getEventType()==HyperlinkEvent.EventType.ACTIVATED)
						loadPage(event.getURL().toString());
				}
			}
		);
		add(new JScrollPane(display), BorderLayout.CENTER);
		setSize(500, 300);
		setVisible(true);
	}
	// Method
	private void loadPage(String link){
		try{
			display.setPage(link);
			addressBar.setText(link);
		}catch(Exception ex){
			System.out.println("An exception was caught.");
		}
	}
}
