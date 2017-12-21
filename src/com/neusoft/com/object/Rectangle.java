package com.neusoft.com.object;

public class Rectangle {
	int length;
	int width;
	public Rectangle(int _length,int _width) {
		this.length = _length;
		this.width = _width;
	}
	void getArea() {
		System.out.println("面积"+length*width);
	}
	
	void getPer() {
		System.out.println("周长"+(2*length+2*width));
	}
	
	void showAll() {
		System.out.println("length: "+ this.length 
				+"\nwidth: "+this.width);
		getArea();
		getPer();
	}
}
