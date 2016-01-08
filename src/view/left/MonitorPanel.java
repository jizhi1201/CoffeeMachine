package view.left;
import java.awt.GridLayout;

import javax.swing.JPanel;


public class MonitorPanel {
	private JPanel view;
	private Indicator ind1;
	private Indicator ind2;
	private Indicator ind3;
	private Indicator ind4;
	private Indicator ind5;
	private static MonitorPanel anInstance;
	public static MonitorPanel getAnInstance(){
		if(anInstance == null){
			anInstance = new MonitorPanel();
		}
		return anInstance;
	}	
	private MonitorPanel(){
		view = new JPanel();
		ind1 = new Indicator("«Îº”ÀÆ");
		ind2 = new Indicator("«Îº”øß∑»");
		ind3 = new Indicator("«Îº”ƒÃ≤Ë");
		ind4 = new Indicator("«Îº”Ã«");
		ind5 = new Indicator("«Îº”±≠");
		
		view.setLayout(new GridLayout(5,1));
		view.add(ind1.getView());
		view.add(ind2.getView());
		view.add(ind3.getView());
		view.add(ind4.getView());
		view.add(ind5.getView());
	}

	public JPanel getView() {
		return view;
	}

	public Indicator getInd1() {
		return ind1;
	}

	public Indicator getInd2() {
		return ind2;
	}

	public Indicator getInd3() {
		return ind3;
	}

	public Indicator getInd4() {
		return ind4;
	}

	public Indicator getInd5() {
		return ind5;
	}
	
	
}
