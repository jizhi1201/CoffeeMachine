package model;

public class Milktea extends Material {

	private final int MAX_NUM = 100;
	private final int ONE_CUP = 10;
	
	public void fill() {		
		this.setQuantity(MAX_NUM);
	}
	
	public void useOneCup() {	
		this.setQuantity(quantity-=ONE_CUP);
	}

}
