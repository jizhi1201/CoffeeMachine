package ctrl;

public class EspressoBoiler extends Boiler {

	@Override
	protected void usePowder() {
		Boiler.box.getCoffee().useOneCup();
	}

}
