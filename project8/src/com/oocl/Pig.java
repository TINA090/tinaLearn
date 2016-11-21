package com.oocl;

public class Pig extends Animal {
	public  Pig(){
		System.out.println("pig无参构造方法执行了");
	}

	public Pig(String string, int i) {
		super(string, i);
		System.out.println("pig有参构造方法执行了");
	}

	public void jiao(){
		System.out.println("pig 重写了叫的方法，猪叫是hengheng");
	}
}
