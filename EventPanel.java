//package intensePingPong;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;


import javax.swing.JPanel;

//The main function of this class is to paint the EventBlocks themselves.
public class EventPanel extends JPanel{

	int widthOfPanel;
	EventBlock eB1;
	
	public EventPanel(EventBlock e) {
		setLayout(new FlowLayout());
		setSize(new Dimension(500,500));
		//may not need this anymore
		//widthOfPanel = this.getWidth();

		eB1 = e;
		repaint();
	}
	
	
	
}
