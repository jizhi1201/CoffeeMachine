package ctrl.state;

import ctrl.Boiler;
import model.CoffeeKind;

public class Sold extends State {

	@Override
	public void putCoin() {
		// TODO Auto-generated method stub
		System.out.println("Please take it out first!");
	}

	@Override
	public void getAllCoins() {
		// TODO Auto-generated method stub
		System.out.println("Please take it out first!");
	}

	@Override
	public void takeOut() {
		// TODO Auto-generated method stub
		takeOutAction();
		if(Boiler.getBox().isNotEmpty()&& coin.isEmpty()){
			chang2No_Coin();
		}else if(Boiler.getBox().isNotEmpty()&& !coin.isEmpty()){
			chang2Has_Coin();
		}else if(!Boiler.getBox().isNotEmpty()&& !coin.isEmpty()){
			getAllCoinsAction();
			chang2Sold_Out();
		}else if(!Boiler.getBox().isNotEmpty()&& coin.isEmpty()){
			chang2Sold_Out();
		}
	}

	@Override
	public void addWater() {
		// TODO Auto-generated method stub
		System.out.println("Please take it out first!");
	}

	@Override
	public void addCoffee() {
		// TODO Auto-generated method stub
		System.out.println("Please take it out first!");
	}

	@Override
	public void addMilktea() {
		// TODO Auto-generated method stub
		System.out.println("Please take it out first!");
	}

	@Override
	public void addSugar() {
		// TODO Auto-generated method stub
		System.out.println("Please take it out first!");
	}

	@Override
	public void addCup() {
		// TODO Auto-generated method stub
		System.out.println("Please take it out first!");
	}

	@Override
	public void chooseCoffee(CoffeeKind kind) {
		// TODO Auto-generated method stub
		System.out.println("Please take it out first!");
	}

}
