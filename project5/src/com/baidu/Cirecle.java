package com.baidu;

public class Cirecle extends Shape {
	int c=5;
	@Override
	public void Perimeter() {
		// TODO Auto-generated method stub
		double perimeter=2*Math.PI*c;
		System.out.println("Բ���ܳ��ǣ�"+perimeter);
	}

	@Override
	public void Area() {
		// TODO Auto-generated method stub
		double area=Math.PI*c*c;
		System.out.println("Բ������ǣ�"+area);
	}

}
