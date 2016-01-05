package ctrl;

public class LightBoiler extends Boiler {

	@Override
	protected void usePowder() {
		// TODO Auto-generated method stub
		Boiler.box.getCoffee().useHalfCup();
	}

}
