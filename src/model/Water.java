package model;

public class Water extends Material {
	
	private final int MAX_NUM = 2000;
	private final int ONE_CUP = 200;
	
	public void fill() {		
		this.setQuantity(MAX_NUM);
	}
	
	public void useOneCup() {	
		this.setQuantity(quantity-=ONE_CUP);
	}

}
