package ctrl.state;

import util.AudioPlayer;
import view.center.AnimationPanel;
import view.left.MonitorPanel;
import ctrl.Boiler;
import ctrl.BoilerController;
import model.CoffeeKind;
import model.Coin;
import model.CoinNumberLabel;

public abstract class State {
	private static final State SOLD_OUT = new Sold_Out();
	private static final State HAS_COIN = new Has_Coin();
	private static final State NO_COIN = new No_Coin();
	private static final State SOLD = new Sold();
	private static State theCurrentState = SOLD_OUT;	
	protected static Coin coin;	
	private static BoilerController bc;
	private static AnimationPanel ap;
	private static AudioPlayer player;
	public static void chang2Sold_Out(){
		theCurrentState = SOLD_OUT;
	}
	public static void chang2Has_Coin(){
		theCurrentState = HAS_COIN;
	}
	public static void chang2No_Coin(){
		theCurrentState = NO_COIN;
	}
	public static void chang2Sold(){
		theCurrentState = SOLD;
	}	
	public static State getTheCurrentState() {
		return theCurrentState;
	}	
	public State(){
		coin = new Coin();		
		bc = new BoilerController();
        ap =  AnimationPanel.getAnInstance();
		player = new AudioPlayer();
        
		coin.addObserver(CoinNumberLabel.getAnInstance());
		Boiler.getBox().getWater().addObserver(MonitorPanel.getAnInstance().getInd1());
		Boiler.getBox().getMilktea().addObserver(MonitorPanel.getAnInstance().getInd3());
		Boiler.getBox().getSugar().addObserver(MonitorPanel.getAnInstance().getInd4());
		Boiler.getBox().getCup().addObserver(MonitorPanel.getAnInstance().getInd5());
		Boiler.getBox().getCoffee().addObserver(MonitorPanel.getAnInstance().getInd2());
	}
	
	public abstract void putCoin();
	public abstract void getAllCoins();
	public abstract void takeOut();
	public abstract void addWater();
	public abstract void addCoffee();
	public abstract void addMilktea();
	public abstract void addSugar();
	public abstract void addCup();
	public abstract void chooseCoffee(CoffeeKind kind);	
	protected void addWaterAction(){			
		Boiler.getBox().getWater().fill();		
	}	
	protected void addCoffeeAction(){
		Boiler.getBox().getCoffee().fill();		
	}	
	protected void addMilkteaAction(){		
		Boiler.getBox().getMilktea().fill();	
	}
	protected void addSugarAction(){	
		Boiler.getBox().getSugar().fill();
	}
	protected void addCupAction(){		
		Boiler.getBox().getCup().fill();
	}
	protected void putCoinAction(){		
		coin.putCoin();
		player.playPutCoin();
	}
	protected void getAllCoinsAction(){		
		while(coin.getNum()>0){
			coin.getCoin();
			try {Thread.sleep(1000);} catch (Exception e) {}
			player.playGetCoin();
		}
	}
	protected void takeOutAction(){	
		ap.takeout();
	}
	protected void chooseCoffeeAction(CoffeeKind kind){		
		bc.getADrink(kind);
		coin.getCoin();
		ap.chooseCoffee(kind);		
		player.playWaterFlow();
		
	}
}
