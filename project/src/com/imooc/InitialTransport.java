package com.imooc;

public class InitialTransport {
	public static void main(String[] args) {
		Bus bus =new Bus();
		bus.color="white";
		bus.max=20;
		Bus bus2 = new Bus();
		bus2.color="white";
		bus2.max=20;
		if(bus.equals(bus2)){
			System.out.println("��ͬ");
		}else{
			System.out.println("����ͬ");
		}
//		bus.max=20;
//		bus.Zuoren();

	}
	
}
