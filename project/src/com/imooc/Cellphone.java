package com.imooc;

public class Cellphone {
	static String name;
	float screen;
	float cpu;
	float mem;
	public Cellphone(){
		System.out.println("�޲εĹ��췽��ִ����");
	}
	
	public Cellphone(float screen2,float cpu2,float mem2){
		if(screen2<3.5){
			System.out.println("���������⣬�Զ���ֵ3.5");
			screen=3.5f;
		}else{
			screen=screen2;
		}
		
		cpu=cpu2;
		mem=mem2;
		
		System.out.println("�вεĹ��췽��ִ����");
	}
}
