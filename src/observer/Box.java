package observer;

import java.util.LinkedList;
import java.util.List;

public class Box {
	private List<Apple> list;
	public Box(){
		list = new LinkedList<Apple>();
	}
	public void eatAll(){
		for(Apple apple:list){
			System.out.println(apple);
		}
	}
}

class Apple{
	
}
