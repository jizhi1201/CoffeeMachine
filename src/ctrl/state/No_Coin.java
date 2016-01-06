package ctrl.state;

import model.CoffeeKind;

public class No_Coin extends State {

	@Override
	public void putCoin() {
		// TODO Auto-generated method stub
		putCoinAction();
		chang2Has_Coin();
	}

	@Override
	public void getAllCoins() {
		// TODO Auto-generated method stub
		System.out.println("There is no coin in CATM");
	}

	@Override
	public void takeOut() {
		// TODO Auto-generated method stub
		System.out.println("Please put a coin!");
	}

	@Override
	public void addWater() {
		// TODO Auto-generated method stub
		System.out.println("You donnot need to do this!");
	}

	@Override
	public void addCoffee() {
		// TODO Auto-generated method stub
		System.out.println("You donnot need to do this!");
	}

	@Override
	public void addMilktea() {
		// TODO Auto-generated method stub
		System.out.println("You donnot need to do this!");
	}

	@Override
	public void addSugar() {
		// TODO Auto-generated method stub
		System.out.println("You donnot need to do this!");
	}

	@Override
	public void addCup() {
		// TODO Auto-generated method stub
		System.out.println("You donnot need to do this!");
	}

	@Override
	public void chooseCoffee(CoffeeKind kind) {
		// TODO Auto-generated method stub
		System.out.println("Please put a coin!");
	}

}
