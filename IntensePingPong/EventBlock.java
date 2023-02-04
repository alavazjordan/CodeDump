//package intensePingPong;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;


//The function of this class is to characterize the blocks via its size, location and movement
public class EventBlock{

	int sideLength = 30;
	//They spawn in within a pixel range of 450-550
	int currentX = 485;
	int currentY = 1;
	int speed = 5;
	boolean onScreen;


	public EventBlock() {
		
	}
	
	
	public void paintEventBlock(Graphics g, int x, int side ) {
		Graphics2D G2D = (Graphics2D)g;
		G2D.setColor(Color.BLUE);
		System.out.println(currentY + " " + currentX + " " + sideLength);
		G2D.fillRect(x, currentY, sideLength, sideLength);
		
	}


	public void fall(){
		currentY += speed;
		
	}	
}
