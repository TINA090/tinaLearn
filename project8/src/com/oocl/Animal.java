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
		System.out.println("���ﶼҪ��");
	}

	public void jiao() {
		System.out.println("���ﶼҪ��");
	}

	public Animal() {
		System.out.println("Animal�޲ι��췽��ִ����");
	}

	public Animal(String name, int i) {
		this.name = name;
		this.age = i;
		System.out.println("Animal�вι��췽��ִ����");
	}

}
