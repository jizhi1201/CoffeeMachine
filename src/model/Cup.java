package model;

public class Cup extends Material {

	private final int MAX_NUM = 10;
	private final int ONE_CUP = 1;
	
	public void fill() {		
		this.setQuantity(MAX_NUM);
	}
	
	public void useOneCup() {	
		this.setQuantity(quantity-=ONE_CUP);
	}

}
