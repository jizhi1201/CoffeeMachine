package view.left;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class Light extends JPanel {

	private boolean on;
	
	public Light(){
		on = true;
	}	
	public void turnOn(){
		on = true;
		repaint();
	}	
	public void turnOff(){
		on = false;
		repaint();
	}	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(on){
			g.setColor(Color.RED);			
		}else{
			g.setColor(Color.GREEN);
		}
		g.fillOval(0, 5, 10, 10);
	}
}
