import java.net.*;
import java.util.*;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUIFiftyMain extends JApplet {
	// Variables
	private HashMap<String, URL> hashMap;
	private ArrayList<String> titles;
	private JList list;
	// Method
	public void init(){
		hashMap = new HashMap<String, URL>();
		titles = new ArrayList<String>();
		
		grabHTMLInfo();
		// Heading
		add(new JLabel("Choose a site:", BorderLayout.NORTH));
		list = new JList(titles.toArray());
	}
	// Method
	
}
