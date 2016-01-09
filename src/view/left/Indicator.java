package view.left;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.MaterialObserver;


public class Indicator implements MaterialObserver {
	private JPanel view;
	private Light light;
	private JLabel lb;
	private String msg;
	public Indicator(String msg){
		this.msg = msg;
		view = new JPanel();
		light = new Light();
		lb = new JLabel(msg);
		
		view.setLayout(null);
		light.setBounds(0, 0, 15, 15);
		view.add(light);
		lb.setBounds(16, 0, 80, 20);
		view.add(lb);	
	}	
	public JPanel getView() {
		return view;
	}
	@Override
	public void update(int quntity) {
		if(quntity == 0){
			light.turnOn();
			lb.setText(msg);
		}else{
			light.turnOff();
			lb.setText(""+quntity);
		}
		
	}

}
