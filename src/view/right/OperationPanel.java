package view.right;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import ctrl.Controller;
import ctrl.OperationFacade;

public class OperationPanel {

	private JPanel view;
	private JButton jbputCoin;
	private JButton jbgetCoin;
	private JButton jbtakeout;
	private OperationFacade of;
	
	public OperationPanel(){
		view = new JPanel();
		jbputCoin = new JButton("Í¶±Ò");
		jbgetCoin = new JButton("ÍË±Ò");
		jbtakeout = new JButton("È¡³ö");
		of = Controller.getAnInstance();
		
		view.setLayout(new GridLayout(3,1));
		view.add(jbputCoin);
		view.add(jbgetCoin);
		view.add(jbtakeout);
	
		
		jbputCoin.addActionListener(
				new PutCoinListener());
		jbgetCoin.addActionListener(
				new GetCoinListener());
		jbtakeout.addActionListener(
				new TakeoutListener());
		
	}

	public JPanel getView() {
		return view;
	}
	class PutCoinListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			of.putCoin();		
		}		
	}
	class GetCoinListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			of.getAllCoins();	
		}		
	}
	class TakeoutListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			of.takeOut();		
		}		
	}
	
}
