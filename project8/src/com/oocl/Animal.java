package com.oocl;

public class Animal {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println("動物都要吃");
	}

	public void jiao() {
		System.out.println("动物都要叫");
	}

	public Animal() {
		System.out.println("Animal无参构造方法执行了");
	}

	public Animal(String name, int i) {
		this.name = name;
		this.age = i;
		System.out.println("Animal有参构造方法执行了");
	}

}
