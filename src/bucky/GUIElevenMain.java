package bucky;

import java.io.File;

public class GUIElevenMain {
	public static void main(String[] args){
		// Mind the need for double backslash on Windows
		File file = new File("C:\\git\\Willem-vanHeemstraSystems\\java-headstart\\src\\bucky\\GUIEleven.txt");
		// Check for existence
		if(file.exists())
			System.out.println(file.getName() + " exists.");
		else
			System.out.println("File does not exist.");
	}
}
