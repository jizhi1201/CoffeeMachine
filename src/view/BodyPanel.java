package view;
import javax.swing.JPanel;

import view.center.CenterPanel;
import view.left.LeftPanel;
import view.right.RightPanel;


public class BodyPanel {
	private JPanel view;
	
	private LeftPanel lp;
	private CenterPanel cp;
	private RightPanel rp;
	
	public BodyPanel(){
		view = new JPanel();
		lp = new LeftPanel();
		cp = new CenterPanel();
		rp = new RightPanel();
		
		view.setLayout(null);
		
		lp.getView().setBounds(0, 0, 100, 240);
		view.add(lp.getView());
		cp.getView().setBounds(100, 0, 200, 240);
		view.add(cp.getView());
		rp.getView().setBounds(300, 0, 100, 240);
		view.add(rp.getView());		
	}

	public JPanel getView() {
		return view;
	}
}
