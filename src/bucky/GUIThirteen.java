package bucky;

import java.io.*;
import java.lang.*;
import java.util.*;

public class GUIThirteen {
	// Variables
	private Formatter formatter;
	// Method
	public void openFile(){
		try{
			// Create a file, or use existing
			formatter = new Formatter("C:\\git\\Willem-vanHeemstraSystems\\java-headstart\\src\\bucky\\GUIThirteen.txt");
		}
		catch(Exception e){
			System.out.println("An exception occured");
		}
	}
	// Method
	public void addRecords(){
		// Write a string of three elements to file
		formatter.format("%s\t%s\t%s", "46", "John", "Doe");
	}
	// Method
	public void closeFile(){
		// Close the file
		formatter.close();
	}
}