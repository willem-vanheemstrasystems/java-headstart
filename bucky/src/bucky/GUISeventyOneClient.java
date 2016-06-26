package bucky;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUISeventyOneClient extends JFrame {
	// Variables
	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String message = "";
	private String serverIP;
	private Socket connection;
	// Constructor
	public GUISeventyOneClient(String host){
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
		
	}
	// Method
	private void showMessage(String message){
		
	}
	// Method
	private void closeAll(){
		
	}
	// Method
	private void connectToServer() throws IOException {
		showMessage("Connecting to Server ...");
		// Connect with host and port (6789)
		connection = new Socket(InetAddress.getByName(serverIP), 6789);
		showMessage("Connected to: "+connection.getInetAddress().getHostName());
	}
	// Method
	private void setupStreams(){
		
	}
	// Method
	private void whileChatting(){
		
	}
}
