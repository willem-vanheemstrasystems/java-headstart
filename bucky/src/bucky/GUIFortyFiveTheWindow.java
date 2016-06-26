package bucky;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUIFortyFiveTheWindow extends JFrame {
	// Variables
	private JSlider slider;
	private GUIFortyFiveDrawOval drawOvalPanel;
	// Constructor
	public GUIFortyFiveTheWindow(){
		super("the Title");
		// Panel
		drawOvalPanel = new GUIFortyFiveDrawOval();
		drawOvalPanel.setBackground(Color.ORANGE);
		// Slider
		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.addChangeListener(
			new ChangeListener(){
				public void stateChanged(ChangeEvent event){
					drawOvalPanel.setDiameter(slider.getValue());
				}
			}
		);
		// Add objects to the frame
		add(slider, BorderLayout.SOUTH);
		add(drawOvalPanel, BorderLayout.CENTER);
	}
}
