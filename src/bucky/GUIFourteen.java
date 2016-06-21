package bucky;

import java.io.*;
import java.util.*;

public class GUIFourteen {
	// Variables
	private Scanner scanner;
	// Method
	public void openFile(){
		try{
			// Open a file
			scanner = new Scanner(new File("C:\\git\\Willem-vanHeemstraSystems\\java-headstart\\src\\bucky\\GUIFourteen.txt"));
		}
		catch(Exception e){
			System.out.println("An exception occured");
		}
	}
	// Method
	public void readFile(){
		// Continue till the end of the file
		while(scanner.hasNext()){
			// Variables
			String a = scanner.next(); // id
			String b = scanner.next(); // first name
			String c = scanner.next(); // last name
			
			System.out.printf("%s\t%s\t%s\n", a, b, c);
		};
	}
	// Method
	public void closeFile(){
		scanner.close();
	}
}
