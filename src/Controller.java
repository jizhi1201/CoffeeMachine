package ctrl;

import ctrl.state.State;
import model.CoffeeKind;

public class Controller implements MaintainFacade,ChoiceFacade,OperationFacade{
	
	private static Controller anInstance;
	private Controller(){		
	}	
	public static Controller getAnInstance(){
		if(anInstance == null){
			anInstance = new Controller();
		}
		return anInstance;
	}
	public void addWater(){			
		State.getTheCurrentState().addWater();	
	}	
	public void addCoffee(){
		State.getTheCurrentState().addCoffee();	
	}	
	public void addMilktea(){		
		State.getTheCurrentState().addMilktea();	
	}
	public void addSugar(){	
		State.getTheCurrentState().addSugar();
	}
	public void addCup(){		
		State.getTheCurrentState().addCup();
	}
	public void putCoin(){		
		State.getTheCurrentState().putCoin();
	}
	public void getAllCoins(){		
		State.getTheCurrentState().getAllCoins();
	}
	public void takeOut(){	
		State.getTheCurrentState().takeOut();
	}
	public void chooseCoffee(CoffeeKind kind){		
		State.getTheCurrentState().chooseCoffee(kind);
	}
}
