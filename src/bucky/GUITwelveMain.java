package bucky;

import java.util.*;

public class GUITwelveMain {
	public static void main(String[] args){
		// Variables
		final Formatter formatter;
		try{
			// Create a file, or use existing
			formatter = new Formatter("C:\\git\\Willem-vanHeemstraSystems\\java-headstart\\src\\bucky\\GUITwelve.txt");
			System.out.println("File created / exists");
		}
		catch(Exception e){
			System.out.println("An exception occured");
		}
		
	}
}
