package com.oocl;

public class Smartphone extends Telphone implements IPlayGame {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("通过语音打电话");
	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("通过语音发短信");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("智能机可以玩游戏");
	}

}
