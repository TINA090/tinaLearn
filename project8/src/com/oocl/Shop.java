package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Shop {
	List<Animal> a = new ArrayList();
	public void add(Animal animal){
		this.a.add(animal);
	}
	public int count(){
		return this.a.size();
	}
	public   Shop(){
		System.out.println("Shop的无参构造方法执行了");
	}
}
