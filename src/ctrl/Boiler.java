package ctrl;

import model.Box;

public abstract class Boiler {
	protected static Box box = new Box();
	public Boiler(){
		
	}
	private void useWater(){
		Boiler.box.getWater().useOneCup();
	}
	protected abstract void usePowder();
	private void useSugar(){
		Boiler.box.getSugar().useOneCup();
	}
	private void useCup(){		
		Boiler.box.getCup().useOneCup();
	}	
	public void boilADrink(){
		useWater();
		usePowder();
		useSugar();
		useCup();	
	}
	public static Box getBox() {
		return Boiler.box;
	}	
}
