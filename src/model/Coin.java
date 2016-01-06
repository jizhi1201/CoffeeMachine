package model;

import java.util.ArrayList;
import java.util.List;

public class Coin {
	private int num = 0;
	private List<CoinObserver> list;
	
	public Coin(){
		list = new ArrayList<CoinObserver>();
	}	
	public void addObserver(CoinObserver co){
		list.add(co);
	}	
	public void removeObserver(CoinObserver co){
		list.remove(co);
	}	
	public void updateAll(){
		for(CoinObserver co:list){
			co.update(num);
		}
	}
	public void putCoin(){
		num++;
		updateAll();
	}
	
	public void getCoin(){
		if(num>0){
			num--;			
			updateAll();
		}
	}

	public int getNum() {
		return num;
	}
	
	public boolean isEmpty(){
		return num==0;
	}
	
}
