import java.net.*;
import java.util.*;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUIFiftyOneMain extends JApplet {
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
		// Add listener
		list.addListSelectionListener(
			new ListSelectionListener(){
				public void valueChanged(ListSelectionEvent event){
					// Get the title of the site
					Object object = list.getSelectedValue();
					// Get the URL of the site
					URL url = hashMap.get(object);
					// Detect the browser
					AppletContext browser = getAppletContext();
					// Follow the url
					browser.showDocument(url);
				}
			}
		);
	}
	// Method
	
}
