package bucky;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUIFortyFourTheWindow extends JFrame {
	// Variables
	private JSlider slider;
	private GUIFortyFourDrawOval drawOvalPanel;
	// Constructor
	public GUIFortyFourTheWindow(){
		super("the Title");
		// Panel
		drawOvalPanel = new GUIFortyFourDrawOval();
		drawOvalPanel.setBackground(Color.ORANGE);
		// Slider
		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
	}
}
