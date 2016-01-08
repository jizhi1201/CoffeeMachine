package view.left;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import model.CoffeeKind;

import ctrl.ChoiceFacade;
import ctrl.Controller;

public class ChoicePanel {
	private JPanel view;
	private JButton jbEsspreso;
	private JButton jbLight;
	private JButton jbMilktea;
	private ChoiceFacade cf;
	
	
	public ChoicePanel(){
		view = new JPanel();
		jbEsspreso = new JButton("Å¨¿§·È");
		jbLight = new JButton("µ­¿§·È");
		jbMilktea = new JButton("ÄÌ  ²è");
		cf = Controller.getAnInstance();
		
		view.setLayout(new GridLayout(3,1));
		view.add(jbEsspreso);
		view.add(jbLight);
		view.add(jbMilktea);	
		
		jbEsspreso.addActionListener(
				new EsspresoListener());
		jbLight.addActionListener(
				new LightListener());
		jbMilktea.addActionListener(
				new MilkteaListener());
		
	}

	public JPanel getView() {
		return view;
	}
	class EsspresoListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			cf.chooseCoffee(CoffeeKind.ESSPRESO);	
		}		
	}
	class LightListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			cf.chooseCoffee(CoffeeKind.LIGHT);		
		}		
	}
	class MilkteaListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			cf.chooseCoffee(CoffeeKind.MILKTEA);	
		}		
	}
	
	
}
