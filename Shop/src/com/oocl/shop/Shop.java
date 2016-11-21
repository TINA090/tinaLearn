package com.oocl.shop;

import java.util.ArrayList;
import java.util.List;

public class Shop {

	private List<Pig> pigs = new ArrayList<Pig>();
	private List<Cat> cats = new ArrayList<Cat>();

	public void add(Pig pig) {
		getPigs().add(pig);
		
	}

	public void add(Cat pig) {
		cats.add(pig);
		
	}
	
	public List<Cat> getCats() {
		return cats;
	}

	public void setCats(List<Cat> cats) {
		this.cats = cats;
	}

	public List<Pig> getPigs() {
		return pigs;
	}

	public void setPigs(List<Pig> pigs) {
		this.pigs = pigs;
	}

	

}
