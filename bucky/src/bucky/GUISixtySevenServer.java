package bucky;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUISixtySevenServer extends JFrame {
	// Variables
	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;
	// Constructor
	public GUISixtySevenServer(){
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
	private void setupStreams() throws IOException {
		output = new ObjectOutputStream(connection.getOutputStream());
		// Clear buffer
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\nStreams are now setup\n");
	}
	// Method
	private void whileChatting() throws IOException{
		String message = "You are now connected";
		sendMessage(message);
		ableToType(true);
		do{
			try{
				message = (String) input.readObject();
				showMessage("\n"+message);
			}catch(ClassNotFoundException classNotFoundException){
				showMessage("\nA ClassNotFoundException occured");
			}
		}while(!message.equals("CLIENT - END"));
	}
	// Method
	private void sendMessage(String message){
		try{
			output.writeObject("SERVER - "+message);
			// Clear buffer
			output.flush();
			showMessage("\nSERVER - "+message);
		}catch(IOException ioException){
			chatWindow.append("\nIOException occured");
		}
	}
	// Method
	private void showMessage(final String message){
		// Update the chat window
		SwingUtilities.invokeLater(
			// Create a thread	
			new Runnable(){
				// Overwrite the abstract method
				public void run(){
					chatWindow.append(message);
				}
			}
		);
	}
	// Method
	private void ableToType(final boolean trueOrFalse){
		// Update the chat window
		SwingUtilities.invokeLater(
			// Create a thread	
			new Runnable(){
				// Overwrite the abstract method
				public void run(){
					userText.setEditable(trueOrFalse);
				}
			}
		);		
	}
	// Method
	private void closeAll(){
		showMessage("\nClosing connections...\n");
		ableToType(false);
		try{
			output.close();
			input.close();
			connection.close();
		}catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
}
