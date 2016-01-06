package main;
import javax.swing.JFrame;

import view.BodyPanel;
public class Coffee {
	private JFrame frame;
	
	public Coffee(){
		frame = new JFrame();
		
		BodyPanel mp = new BodyPanel();		
		frame.add(mp.getView());
		
		frame.setTitle("HUST jizhi1201 CoffeeMachine");
		frame.setSize(400,240);
		frame.setLocation(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Coffee();
	}
}
