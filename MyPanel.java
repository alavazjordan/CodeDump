package intensePingPong;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MyPanel extends JPanel{

	
	public MyPanel() {
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(500,500));
		
		EventPanel ePanel = new EventPanel(this);
		add(ePanel);
	}
	
	
	
}
