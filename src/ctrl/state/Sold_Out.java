package ctrl.state;

import ctrl.Boiler;
import model.CoffeeKind;

public class Sold_Out extends State {

	@Override
	public void putCoin() {
		// TODO Auto-generated method stub
		System.out.println("Don't put coin,there is nothing!");
	}	

	@Override
	public void getAllCoins() {
		// TODO Auto-generated method stub
		if(coin.isEmpty()){
			System.out.println("There is no coin in CATM!");
		}else{
			getAllCoinsAction();
		}
	}

	@Override
	public void takeOut() {
		// TODO Auto-generated method stub
		System.out.println("What are you doing?");
	}

	@Override
	public void addWater() {
		// TODO Auto-generated method stub
		addWaterAction();
		if(Boiler.getBox().isNotEmpty()){
			chang2No_Coin();
		}
	}

	@Override
	public void addCoffee() {
		// TODO Auto-generated method stub
		addCoffeeAction();
		if(Boiler.getBox().isNotEmpty()){
			chang2No_Coin();
		}
	}

	@Override
	public void addMilktea() {
		// TODO Auto-generated method stub
		addMilkteaAction();
		if(Boiler.getBox().isNotEmpty()){
			chang2No_Coin();
		}
	}

	@Override
	public void addSugar() {
		// TODO Auto-generated method stub
		addSugarAction();
		if(Boiler.getBox().isNotEmpty()){
			chang2No_Coin();
		}
	}

	@Override
	public void addCup() {
		// TODO Auto-generated method stub
		addCupAction();
		if(Boiler.getBox().isNotEmpty()){
			chang2No_Coin();
		}
	}

	@Override
	public void chooseCoffee(CoffeeKind kind) {
		// TODO Auto-generated method stub
		System.out.println("Don't waste your energy, there is nothing!");
	}

}
