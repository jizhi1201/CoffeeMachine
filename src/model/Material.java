package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Material {
	protected int quantity;	
	private List<MaterialObserver> list;
	public Material(){
		list = new ArrayList<MaterialObserver>();
	}
	public void addObserver(MaterialObserver mo){
		list.add(mo);
	}
	public void removeObserver(MaterialObserver mo){
		list.remove(mo);
	}
	public void updateAll(){
		for(MaterialObserver mo:list){
			mo.update(quantity);			
		}
	}
	
	public abstract void fill();
	public abstract void useOneCup();
	public  boolean isEmpty(){
		return quantity == 0;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		updateAll();
	}	
}
