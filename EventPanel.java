package intensePingPong;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

//The main function of this class is to paint the EventBlocks themselves.
public class EventPanel extends JPanel{

	int startingX;
	int sideLength;
	
	EventBlock eB1;
	MyPanel mp;
	
	public EventPanel(MyPanel mp) {
		
		startingX = mp.getWidth();
		sideLength = mp.getWidth()/10;
		repaint();

		this.mp = mp;
		eB1 = new EventBlock(mp);
		
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(500,500));
		
	}
	
	
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D)g;
		if(eB1 != null)
			eB1.paintEventBlock(g2D, startingX, sideLength);
		
	}
	
	public void update() {
		repaint();
	}
}
