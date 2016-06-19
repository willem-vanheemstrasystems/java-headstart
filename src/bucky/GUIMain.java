package bucky;

import javax.swing.JOptionPane;

public class GUIMain {
	public static void main(String[] args){
		// Placeholder for the first number entered
		String fn = JOptionPane.showInputDialog("Enter first number");
		// Placeholder for the second number entered
		String sn = JOptionPane.showInputDialog("Enter second number");

		// Convert inputs to numbers
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);		
		
		int sum = num1 + num2;

		// Show the outcome
		JOptionPane.showMessageDialog(null, "The sum is " + sum, "The Title", JOptionPane.PLAIN_MESSAGE);
		
		
	}
}
