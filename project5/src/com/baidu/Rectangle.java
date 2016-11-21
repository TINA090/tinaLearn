package com.baidu;

public class Rectangle extends Shape {
	int a=4;
	int b=5;
	@Override
	public void Perimeter() {
		// TODO Auto-generated method stub
		int perimeter= (a+b)*2;
		System.out.println("矩形的周长是："+perimeter);
	}

	@Override
	public void Area() {
		// TODO Auto-generated method stub
		int area=a*b;
		System.out.println("矩形的面积是："+area);
	}

	

}
