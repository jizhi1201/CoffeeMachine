package observer;

import java.util.ArrayList;
import java.util.List;

public class Gold {
	private int num;
	private List<Observer> olist;
	public Gold(){
		olist = new ArrayList<Observer>();
	}
	public void addObserver(Observer o){
		olist.add(o);
	}
	public void removeObserver(Observer o){
		olist.remove(o);
	}
	public void updateAll(){
		for(Observer o:olist){
			o.update();
		}
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
		updateAll();
	}
	
}
