package bucky;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUISeventySixClient extends JFrame {
	// Variables
	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String message = "";
	private String serverIP;
	private Socket connection;
	// Constructor
	public GUISeventySixClient(String host){
		super("the Client");
		serverIP = host;
		userText = new JTextField();
		userText.setEditable(false);
		userText.addActionListener(
			// Anonymous inner class
			new ActionListener(){
				// Overwrite absolute method
				public void actionPerformed(ActionEvent event){
					sendMessage(event.getActionCommand());
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
	public void startRunning(){
		try{
			connectToServer();
			setupStreams();
			whileChatting();
		}catch(EOFException eofException){
			showMessage("\nClient terminated connection");
		}catch(IOException ioException){
			ioException.printStackTrace();
		}finally{
			closeAll();
		}
	}
	// Method
	private void sendMessage(String message){
		try{
			output.writeObject("CLIENT - "+message);
			// Clear the buffer
			output.flush();
			showMessage("\nCLIENT - "+message);
		}catch(IOException ioException){
			chatWindow.append("\nIOException occured");
		}
	}
	// Method
	private void showMessage(final String message){
		// Update chatWindow
		SwingUtilities.invokeLater(
			// Anonymous inner class
			new Runnable(){
				// Overwrite abstract method
				public void run(){
					chatWindow.append(message);
				}
			}	
		);
	}
	// Method
	private void closeAll(){
		showMessage("\n Closing connection...");
		ableToType(false);
		try{
			output.close();
			input.close();
			connection.close();
		}catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
	// Method
	private void connectToServer() throws IOException {
		showMessage("Connecting to Server ...");
		// Connect with host and port (6789)
		connection = new Socket(InetAddress.getByName(serverIP), 6789);
		showMessage("Connected to: "+connection.getInetAddress().getHostName());
	}
	// Method
	private void setupStreams() throws IOException {
		output = new ObjectOutputStream(connection.getOutputStream());
		// Clear the buffer
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\nStreams are now connected\n");
	}
	// Method
	private void whileChatting() throws IOException {
		ableToType(true);
		do{
			try{
				message = (String) input.readObject();
				showMessage("\n"+message);
			}catch(ClassNotFoundException classNotFoundException){
				showMessage("Unknown object");
			}
		}while(!message.equals("SERVER - END"));
	}
	// Method
	private void ableToType(final boolean trueOrFalse){
		// Update userTextField
		SwingUtilities.invokeLater(
			// Anonymous inner class
			new Runnable(){
				// Overwrite abstract method
				public void run(){
					userText.setEditable(trueOrFalse);
				}
			}	
		);		
	}
}
