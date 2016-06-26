package bucky;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUISixtyOneServer extends JFrame {
	// Variables
	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;
	// Constructor
	public GUISixtyOneServer(){
		super("the Server");
		// user text
		userText = new JTextField();
		userText.setEditable(false);
		userText.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent event){
					sendMessage(event.getActionCommand());
					// Clear text field
					userText.setText("");
				}
			}
		);
		add(userText, BorderLayout.NORTH);
		// chat window
		chatWindow = new JTextArea();
		add(new JScrollPane(chatWindow));
		setSize(300, 150);
		setVisible(true);
	}
	//
	public void startRunning(){
		try{
			// port 6789, queue length 100
			server = new ServerSocket(6789, 100);
			// run forever
			while(true){
				try{
					waitForConnection();
					setupStreams();
					whileChatting();
				}catch(EOFException eofException){
					showMessage("\n Server ended the connection");
				}finally{
					closeAll();
				}
			}
		}catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
	// Method
	private void waitForConnection() throws IOException {
		showMessage("Waiting for someone to connect ...\n");
		connection = server.accept();
		showMessage("Now connected to "+connection.getInetAddress().getHostName());
	}
	// Method
	private void sendMessage(String message){
		
	}
	// Method
	private void showMessage(String message){
		
	}
}
