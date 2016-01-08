package view.left;
import javax.swing.JPanel;


public class LeftPanel {
	private JPanel view;
	private MonitorPanel mp;
	private ChoicePanel cp;
	
	public LeftPanel(){
		view = new JPanel();
		mp = MonitorPanel.getAnInstance();
		cp = new ChoicePanel();
		
		view.setLayout(null);
		
		mp.getView().setBounds(5, 5, 90, 90);
		view.add(mp.getView());
		cp.getView().setBounds(10, 115, 80, 70);
		view.add(cp.getView());		
	}
	public JPanel getView() {
		return view;
	}
}
