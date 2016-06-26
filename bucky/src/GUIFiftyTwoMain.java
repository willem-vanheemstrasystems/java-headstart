import java.net.*;
import java.util.*;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUIFiftyTwoMain extends JApplet {
	// Variables
	private HashMap<String, URL> hashMap;
	private ArrayList<String> titles;
	private JList list;
	// Method
	public void init(){
		hashMap = new HashMap<String, URL>();
		titles = new ArrayList<String>();
		// Retrieve the data from the HTML
		grabHTMLInfo();
		// Heading
		add(new JLabel("Choose a site:"), BorderLayout.NORTH);
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
	private void grabHTMLInfo(){
		// Variables
		String title;
		String address;
		URL url;
		int counter = 0;
		title = getParameter("title"+counter);
		// Loop
		while(title != null){
			address = getParameter("address"+counter);
			// Convert to URL object
			try{
				url = new URL(address);
				// Populate hashmap
				hashMap.put(title, url);
				// Populate titles array list
				titles.add(title);
			}catch(MalformedURLException urlException){
				urlException.printStackTrace();
			}
			++counter;
			getParameter("title"+counter);
		}
	}
}
