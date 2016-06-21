package bucky;

import javax.swing.JFrame;

public class GUINineMain {
	public static void main(String[] args){
		GUINine guiNine= new GUINine();
		guiNine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiNine.setSize(300, 200);
		guiNine.setVisible(true);
	}
}
