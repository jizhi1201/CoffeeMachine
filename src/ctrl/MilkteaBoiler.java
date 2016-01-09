package ctrl;

public class MilkteaBoiler extends Boiler {

	@Override
	protected void usePowder() {
		// TODO Auto-generated method stub
		Boiler.box.getMilktea().useOneCup();
	}

}
