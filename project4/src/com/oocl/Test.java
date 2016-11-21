package com.oocl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telphone phone1=new Cellphone();
		Smartphone phone2 = new Smartphone();
		phone1.call();
		phone2.call();
		IPlayGame ip1 = new Smartphone();
		ip1.playGame();
		IPlayGame ip2= new Psp();
		ip2.playGame();
		IPlayGame ip3 = new IPlayGame(){

			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("使用匿名内部类实现接口");
			}
		};
		ip3.playGame();
		new IPlayGame(){
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("使用匿名内部类实现接口2222");
			}
		}.playGame();
	}

}
