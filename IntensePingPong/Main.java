import java.awt.Container;
import javax.swing.JFrame;

public class Main extends JFrame{
	
	
	public Main() {
		setTitle("Demo for the event function");
		
		Container pane = getContentPane();
		MyPanel mp = new MyPanel();
		pane.add(mp);
		
		pack();
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		
	}
	
	
	public static void main(String[] args) {
		new Main();


	}

}
