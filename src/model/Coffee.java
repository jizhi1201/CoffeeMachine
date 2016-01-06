package model;

public class Coffee extends Material {

	private final int MAX_NUM = 100;
	protected final int ONE_CUP = 10;
	protected final int HALF_CUP = 5;
	
	public void fill() {		
		this.setQuantity(MAX_NUM);
	}
	
	public void useOneCup(){
		this.setQuantity(this.quantity-=ONE_CUP);
	}
	public void useHalfCup(){
		this.setQuantity(this.quantity-=HALF_CUP);
	}

}
