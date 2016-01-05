package ctrl;

import model.CoffeeKind;

public class BoilerController {
	private static Boiler espressoBoiler = new EspressoBoiler();
	private static Boiler lightBoiler = new LightBoiler();
	private static Boiler milkteaBoiler = new MilkteaBoiler();

	public void getADrink(CoffeeKind kind) {
		switch (kind) {
		case ESSPRESO:
			espressoBoiler.boilADrink();
			break;
		case LIGHT:
			lightBoiler.boilADrink();
			break;
		case MILKTEA:
			milkteaBoiler.boilADrink();
			break;
		}
	}
}
