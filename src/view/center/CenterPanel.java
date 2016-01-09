package view.center;

import javax.swing.JPanel;


public class CenterPanel {
	private JPanel view;
	private ShowPanel sp;
	private AnimationPanel ap;

	public CenterPanel(){
		view = new JPanel();
		sp = new ShowPanel();
		ap = AnimationPanel.getAnInstance();
	//	ap.chooseCoffee(CoffeeKind.ESSPRESO);
		
		view.setLayout(null);
		sp.getView().setBounds(0, 0, 200, 30);		
		view.add(sp.getView());		
		ap.setBounds(0, 41, 200, 200);
		view.add(ap);
	}
	public JPanel getView() {
		return view;
	}
	
	
}
