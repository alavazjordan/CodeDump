package intensePingPong;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Timer;
import java.util.TimerTask;

//The function of this class is to characterize the blocks via its size, location and movement
public class EventBlock{

	public EventBlock(MyPanel mp) {

	}
	
	
	public void paintEventBlock(Graphics g, int x, int side ) {
		Graphics2D G2D = (Graphics2D)g;

		G2D.drawRect(250, 0, 25, 25);
		G2D.fillRect(250, 0, 25, 25);
		
	}
	
	
}
