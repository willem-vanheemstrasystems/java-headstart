package bucky;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUISixtyNineClient extends JFrame {
	// Variables
	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String message = "";
	private String serverIP;
	private Socket connection;
	// Constructor
	public GUISixtyNineClient(String host){
		super("the Client");
		serverIP = host;
		userText = new JTextField();
		userText.setEditable(false);
		userText.addActionListener(
			// Anonymous inner class
			new ActionListener(){
				// Overwrite absolute method
				public void actionPerformed(ActionEvent event){
					sendData(event.getActionCommand());
					userText.setText("");
				}
			}
		);
		add(userText, BorderLayout.NORTH);
		chatWindow = new JTextArea();
		add(new JScrollPane(chatWindow), BorderLayout.CENTER);
		setSize(300,150);
		setVisible(true);
	}
	// Method
	private void sendData(){
		
	}
}
