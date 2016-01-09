package view.right;
import javax.swing.JPanel;

public class RightPanel {
	private JPanel view;
	private MaintainPanel mp;
	private OperationPanel op;
	
	public RightPanel(){
		view  = new JPanel();
		mp = new MaintainPanel();
		op = new OperationPanel();
		
		view.setLayout(null);
		
		mp.getView().setBounds(15, 5, 70, 90);
		view.add(mp.getView());
		op.getView().setBounds(10, 115, 80, 70);
		view.add(op.getView());
	}

	public JPanel getView() {
		return view;
	}
	
}
