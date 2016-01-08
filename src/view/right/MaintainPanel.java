package view.right;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import ctrl.Controller;
import ctrl.MaintainFacade;

public class MaintainPanel {
	private JPanel view;
	private JButton jbaddWater;
	private JButton jbaddPowder;
	private JButton jbaddSugar;
	private JButton jbaddCup;
	private MaintainFacade mf;
	
	public MaintainPanel(){
		view = new JPanel();
		jbaddWater = new JButton("加水");
		jbaddPowder = new JButton("加粉");
		jbaddSugar = new JButton("加糖");
		jbaddCup = new JButton("加杯");
		mf = Controller.getAnInstance();
		
		view.setLayout(new GridLayout(4,1));
		view.add(jbaddWater);
		view.add(jbaddPowder);
		view.add(jbaddSugar);
		view.add(jbaddCup);
		
		jbaddWater.addActionListener(
				new AddWaterListener());
		jbaddPowder.addActionListener(
				new AddPowderListener());
		jbaddSugar.addActionListener(
				new AddSugarListener());
		jbaddCup.addActionListener(
				new AddCupListener());
	}

	public JPanel getView() {
		return view;
	}
	class AddWaterListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			mf.addWater();	
		}		
	}
	class AddPowderListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			mf.addCoffee();
			mf.addMilktea();
		}		
	}
	class AddSugarListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			mf.addSugar();		
		}		
	}
	class AddCupListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			mf.addCup();	
		}		
	}
	
}
