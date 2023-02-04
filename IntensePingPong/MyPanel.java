import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	EventBlock[] eB = new EventBlock[3];
	//EventBlock eB1 = new EventBlock();
	Timer timer = new Timer();
	
	
	public MyPanel() {
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(1000,1000));

		setAttributes(eB);
		//at a 10 millisecond interval, it updates y cordinates and repaints
		timer.schedule(new TimerTask() {
			public void run() {
			  eB[0].fall();
			  eB[1].fall();
			  eB[2].fall();

			  offScreen(eB[0]);
			  offScreen(eB[1]);
			  offScreen(eB[2]);
			  repaint();
			}
		  }, 0, 10); 
		
	}

	//This everytime the graphics are updated/repainted this is method is used
	public void paint(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g;
		eB[0].paintEventBlock(g2D, eB[0].currentX, eB[0].sideLength);
		eB[1].paintEventBlock(g2D, eB[1].currentX, eB[1].sideLength);
		eB[2].paintEventBlock(g2D, eB[2].currentX, eB[2].sideLength);
	}

	//populates the three maximum EventBlocks
	private void setAttributes(EventBlock[] eB){
		for(int i = 0; i< eB.length; i++){

			eB[i] = new EventBlock();

			if(i == 0){
				eB[i].currentX = 450;
				eB[i].speed = determineSpeed();
			}
			if(i == 1){
				eB[i].currentX = 500;
				eB[i].speed = determineSpeed();
			}
			if(i == 2){
				eB[i].currentX = 550;
				eB[i].speed = determineSpeed();
			}
			else{
				System.out.println("Error setting attributes of event blocks");
			}
		}
	}

	//Sets the block at the top with a random speed
	private void respawn(EventBlock eB){
		eB.currentY = 1;
		eB.speed = determineSpeed();
	}

	//Sets a random speed
	private int determineSpeed(){
		Random rand = new Random();
		int temp = rand.nextInt(19)+1;
		return temp;
	}
	
	//checks if block is off screen, then if is, it will run a randomized timer to respawn it
	private void offScreen(EventBlock eB){
		if(eB.currentY > getHeight()){
			respawn(eB);
		}
	}
	
	
}
