package view.center;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import model.CoffeeKind;


public class AnimationPanel extends JPanel{
	private CoffeeKind kind;
	private int shift = 0;
	private final int STEP = 2;
	private static AnimationPanel anInstance;
	private boolean out;
	public static AnimationPanel getAnInstance(){
		if(anInstance == null){
			anInstance = new AnimationPanel();
		}
		return anInstance;
	}
	private  AnimationPanel(){
		kind = CoffeeKind.MILKTEA;
		out = true;
	}
	
	
	public void chooseCoffee(CoffeeKind kind){
		out = false;
		this.kind = kind;
		AnimCtrl ac = new AnimCtrl();
		ac.start();
	}
	public void takeout(){
		out = true;
		repaint();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if(!out){
			g.setColor(Color.WHITE);
			g.fill3DRect(65, 50, 70, 100,true);
			
			if(kind == CoffeeKind.ESSPRESO){
				g.setColor(new Color(97,48,48));
			}else if(kind == CoffeeKind.LIGHT){
				g.setColor(new Color(183,0,0));
			}else{
				g.setColor(new Color(128,128,0));
			}
			
			g.fill3DRect(65, 150-shift, 70, shift, true);
		}		
	}
	
	class AnimCtrl extends Thread{
		public void run(){
			shift = 0;
			while(shift<=90){
				shift+=STEP;
				repaint();
				try {sleep(50);} catch (Exception e) {}				
			}
		}
	}
}
