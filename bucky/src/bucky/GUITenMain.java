package bucky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUITenMain {
	public static void main(String[] args){
		GUITen guiTen= new GUITen();
		guiTen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiTen.setSize(300, 200);
		guiTen.setVisible(true);
	}
}
