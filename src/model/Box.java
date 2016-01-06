package model;

public class Box {
	private Water water;
	private Sugar sugar;
	private Cup cup;
	private Milktea milktea;
	private Coffee coffee; 
	
	public Box(){
		water = new Water();
		sugar = new Sugar();
		cup = new Cup();
		milktea = new Milktea();
        coffee = new Coffee();
	}

	public Water getWater() {
		return water;
	}

	public Sugar getSugar() {
		return sugar;
	}

	public Cup getCup() {
		return cup;
	}

	public Milktea getMilktea() {
		return milktea;
	}

	public Coffee getCoffee() {
		return coffee;
	}
	public boolean isNotEmpty(){
		return !water.isEmpty()&&
			    !coffee.isEmpty()&&
				!milktea.isEmpty()&&
				!sugar.isEmpty()&&
				!cup.isEmpty();
	}
	
}
