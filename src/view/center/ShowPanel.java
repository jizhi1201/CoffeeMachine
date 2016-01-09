package view.center;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import model.CoinNumberLabel;

public class ShowPanel {
	private JPanel view;
	
	private JLabel jl1;
	private JLabel jl2;
	private JLabel jl3;
	private CoinNumberLabel jl4;

	public ShowPanel(){
		view = new JPanel();
		jl1 = new JLabel("Ë®ÎÂ:");
		jl2 = new JLabel("95¡æ");
		jl3 = new JLabel("±ÒÖµ:");
		jl4 = CoinNumberLabel.getAnInstance();
		
		view.setBorder(
				BorderFactory.
				createBevelBorder(
						BevelBorder.RAISED));
		
		view.setLayout(new GridLayout(1,4));
		view.add(jl1);
		view.add(jl2);
		view.add(jl3);
		view.add(jl4);
	}

	public JPanel getView() {
		return view;
	}		
}
