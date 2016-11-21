package com.oocl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 编写一个控制台的答答租车系统
 * 功能：
 * 1. 展示所有可租车辆
 * 2.选择车型、租车数量
 * 3.展示租车清单，包含：总金额、总载货量及其车型、总载人量及其车型
 * 客车： 载货量， 情形， 重型
 * 货车：载客量， 小客车，大客车
 * 皮卡： 载客， 载货
 */
public class Calculate {

	public static void main(String[] args) {
		/*Car c[]= new Car[6];
		c[0]= new PassagerCar(1,"奥迪A4",500,4,0);
		c[1]=new PassagerCar(2,"马自达6",400,4,0);
		c[2]=new PickUp(3,"皮卡雪6",450,4,2);
		c[3]= new  PassagerCar(4,"金龙",800,20,0);
		c[4]=new Truck(5,"松花江",400,0,4);
		c[5]=new Truck(6,"依维柯",1000,0,20);
	
		List<Car> cars;
		cars = new ArrayList();
		for(int i=0;i<6;i++){
			cars.add(c[i]);
		}*/
//		System.out.println(cars);
		Car c[] ={new PassagerCar(1,"奥迪A4",500,4,0),
				new PassagerCar(2,"马自达6",400,4,0),
				new PickUp(3,"皮卡雪6",450,4,2),
				new PassagerCar(4,"金龙",800,20,0),
				new Truck(5,"松花江",400,0,4),
				new Truck(6,"依维柯",1000,0,20)};
		
		Scanner input= new Scanner(System.in);
		System.out.println("欢迎使用嗒嗒租车系统："+"\n"+"您是否要租车：1是 0否");
		int a= input.nextInt();
		if (a==1){
			//显示表格
			displayList(c);
			//接收用户输入
			Scanner input2= new Scanner(System.in);
			System.out.println("请输入您要租汽车的数量：");
			int expectedNum=input2.nextInt();
			//将用户输入的存起来，并且计算账单
			int[] wantedCarList= new int[expectedNum];
			int sum=0;
			for(int i=0;i<expectedNum;i++){
				Scanner input3= new Scanner(System.in);
				System.out.println("请输入第"+(i+1)+"辆车的序号：");
				wantedCarList[i]=input3.nextInt();
				sum=sum+c[wantedCarList[i]-1].charge;
			}
			Scanner input4= new Scanner(System.in);
			System.out.println("请输入您要租的天數：");
			int day=input4.nextInt();
			sum=sum*day;
			System.out.println("您的賬單為："+sum);
			
			
		}
		// TODO Auto-generated method stub
		
	}
	public static void displayList(Car[] c){
		System.out.println("您可租车的类型及其价目表：");
		System.out.println("\t"+"序号"+"\t"+"汽车名称"+"\t"+"租金"+"\t"+"容量");
		for(int i=0;i<c.length;i++){
			System.out.println("\t"+c[i].getId()+"\t"+c[i].getName()+"\t"+c[i].getCharge()+"元/天"
					+"\t"+"载人："+c[i].getMaxPerson()+"人 "+"载货："+c[i].getMaxCargo()+"吨");
			
		}
		/*for(Car car:cars){
			System.out.println("\t"+car.getId()+"\t"+car.getName()+"\t"+car.getCharge()+"元/天"
		+"\t"+"载人："+car.getMaxPerson()+"人 "+"载货："+car.getMaxCargo()+"吨");*/
		
		}
	}


