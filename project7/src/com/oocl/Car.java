package com.oocl;

public class Car {
	public String name;
	public int id;
	public int maxCargo;
	public int maxPerson;
	public int charge;
	public Car(int Iid,String Iname,int Icharge,int ImaxPerson,int ImaxCargo){
		this.id=Iid;
		this.name=Iname;
		this.maxCargo=ImaxCargo;
		this.maxPerson=ImaxPerson;
		this.charge=Icharge;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxCargo() {
		return maxCargo;
	}
	public void setMaxCargo(int maxCargo) {
		this.maxCargo = maxCargo;
	}
	public int getMaxPerson() {
		return maxPerson;
	}
	public void setMaxPerson(int maxPerson) {
		this.maxPerson = maxPerson;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	
	

}
