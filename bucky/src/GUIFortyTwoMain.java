import java.awt.*;
import javax.swing.*;

public class GUIFortyTwoMain extends JApplet {
	// Variables
	private double sum;
	// Overwrite init method,
	// which always gets executed first
	// by default
	public void init() {
		String firstNumber = JOptionPane.showInputDialog("Enter first number.");
		String secondNumber = JOptionPane.showInputDialog("Enter second number.");
		// Convert String values to doubles
		double numOne = Double.parseDouble(firstNumber);
		double numTwo = Double.parseDouble(secondNumber);
		// Sum up the numbers
		sum = numOne + numTwo;
	}
	// Method
	public void paint(Graphics g){
		// Call super class's paint methods
		super.paint(g);
		g.drawString("The sum is: "+sum, 25, 30);
	}
}
