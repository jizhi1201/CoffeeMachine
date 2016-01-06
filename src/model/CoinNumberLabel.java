package model;

import javax.swing.JLabel;

public class CoinNumberLabel extends JLabel implements CoinObserver {
	
	private static CoinNumberLabel anInstance;
	
	public static CoinNumberLabel getAnInstance(){
		if(anInstance == null){
			anInstance = new CoinNumberLabel();
		}
		return anInstance;
	}	
	
	private CoinNumberLabel(){
		this.setText("0");
	}
	
	public void update(int num) {
		this.setText(""+num);
	}

}
