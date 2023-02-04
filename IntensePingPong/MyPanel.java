import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	EventBlock[] eB = new EventBlock[3];
	EventBlock eB1 = new EventBlock();
	Timer timer = new Timer();
	
	
	public MyPanel() {
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(1000,1000));

		populate(eB);
		//at a 10 millisecond interval, it updates y cordinates and repaints
		timer.schedule(new TimerTask() {
			public void run() {
			  eB1.fall();
			  repaint();
			}
		  }, 0, 10); 
		
	}

	//This everytime the graphics are updated/repainted this is method is used
	public void paint(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g;
		eB1.paintEventBlock(g2D, eB1.currentX, eB1.sideLength);
	}

	//populates the three maximum EventBlocks
	public void populate(EventBlock[] eB){
		for(int i = 0; i< eB.length; i++){
			eB[i] = new EventBlock();

			if(i == 0){
				eB[i].currentX = 450;
			}
			if(i == 1){
				eB[i].currentX = 500;
			}
			if(i == 2){
				eB[i].currentX = 550;
			}
		}
	}
	
	
	
}
