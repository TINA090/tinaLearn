package com.oocl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * ��дһ������̨�Ĵ���⳵ϵͳ
 * ���ܣ�
 * 1. չʾ���п��⳵��
 * 2.ѡ���͡��⳵����
 * 3.չʾ�⳵�嵥���������ܽ����ػ������䳵�͡������������䳵��
 * �ͳ��� �ػ����� ���Σ� ����
 * �������ؿ����� С�ͳ�����ͳ�
 * Ƥ���� �ؿͣ� �ػ�
 */
public class Calculate {

	public static void main(String[] args) {
		/*Car c[]= new Car[6];
		c[0]= new PassagerCar(1,"�µ�A4",500,4,0);
		c[1]=new PassagerCar(2,"���Դ�6",400,4,0);
		c[2]=new PickUp(3,"Ƥ��ѩ6",450,4,2);
		c[3]= new  PassagerCar(4,"����",800,20,0);
		c[4]=new Truck(5,"�ɻ���",400,0,4);
		c[5]=new Truck(6,"��ά��",1000,0,20);
	
		List<Car> cars;
		cars = new ArrayList();
		for(int i=0;i<6;i++){
			cars.add(c[i]);
		}*/
//		System.out.println(cars);
		Car c[] ={new PassagerCar(1,"�µ�A4",500,4,0),
				new PassagerCar(2,"���Դ�6",400,4,0),
				new PickUp(3,"Ƥ��ѩ6",450,4,2),
				new PassagerCar(4,"����",800,20,0),
				new Truck(5,"�ɻ���",400,0,4),
				new Truck(6,"��ά��",1000,0,20)};
		
		Scanner input= new Scanner(System.in);
		System.out.println("��ӭʹ�����⳵ϵͳ��"+"\n"+"���Ƿ�Ҫ�⳵��1�� 0��");
		int a= input.nextInt();
		if (a==1){
			//��ʾ���
			displayList(c);
			//�����û�����
			Scanner input2= new Scanner(System.in);
			System.out.println("��������Ҫ��������������");
			int expectedNum=input2.nextInt();
			//���û�����Ĵ����������Ҽ����˵�
			int[] wantedCarList= new int[expectedNum];
			int sum=0;
			for(int i=0;i<expectedNum;i++){
				Scanner input3= new Scanner(System.in);
				System.out.println("�������"+(i+1)+"��������ţ�");
				wantedCarList[i]=input3.nextInt();
				sum=sum+c[wantedCarList[i]-1].charge;
			}
			Scanner input4= new Scanner(System.in);
			System.out.println("��������Ҫ����씵��");
			int day=input4.nextInt();
			sum=sum*day;
			System.out.println("�����~�Ξ飺"+sum);
			
			
		}
		// TODO Auto-generated method stub
		
	}
	public static void displayList(Car[] c){
		System.out.println("�����⳵�����ͼ����Ŀ��");
		System.out.println("\t"+"���"+"\t"+"��������"+"\t"+"���"+"\t"+"����");
		for(int i=0;i<c.length;i++){
			System.out.println("\t"+c[i].getId()+"\t"+c[i].getName()+"\t"+c[i].getCharge()+"Ԫ/��"
					+"\t"+"���ˣ�"+c[i].getMaxPerson()+"�� "+"�ػ���"+c[i].getMaxCargo()+"��");
			
		}
		/*for(Car car:cars){
			System.out.println("\t"+car.getId()+"\t"+car.getName()+"\t"+car.getCharge()+"Ԫ/��"
		+"\t"+"���ˣ�"+car.getMaxPerson()+"�� "+"�ػ���"+car.getMaxCargo()+"��");*/
		
		}
	}


