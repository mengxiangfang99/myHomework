package com.neusoft.com.gaojiobject;

public abstract class Shape {
	
	public static void main(String[] args) {
		Rectangle a = new Rectangle(1,2,"yellow");
		Circle b = new Circle(2,"black");
		a.showAll();
		b.showAll();
	}
	
	double area;
	double per;
	String color;

	//颜色
	public String getColor() {
		return this.color;
	};
	 
	public Shape() {
		
	}
	public Shape(String _color) {
		this.color = _color;
	}
	
	//面积
	 abstract void getArea();
	//周长
	 abstract void getPer();
	 //显示
	 abstract void showAll(); 
}

class Rectangle extends Shape{
	double height;
	double width;
	
	public Rectangle() {};
	public Rectangle(double _height,double _width, String _color) {
		super(_color);
		this.height = _height;
		this.width = _width;
		super.area = this.height*this.width;
		super.per = 2*(this.height+this.width);
	};
	
	public void getArea(){
		System.out.println("面积："+ super.area);
	};
	public void getPer(){
		System.out.println("周长："+ super.per);
	};
	public void showAll(){
		System.out.println("面积："+ super.area);
		System.out.println("周长："+ super.per);
		System.out.println("高度："+ this.height);
		System.out.println("宽度："+ this.width);
		System.out.println("颜色："+ super.color);
	}
}


class Circle extends Shape{
	double radius;
	static final double pi = 3.14;
	
	public Circle() {};
	public Circle(double _radius,String _color) {
		super(_color);
		this.radius = _radius;
		super.area = pi*this.radius*this.radius;
		super.per = 2*pi*this.radius;
	};
	
	void getArea() {
		System.out.println("面积："+ super.area);
	}

	void getPer() {
		System.out.println("周长："+ super.per);
	}

	void showAll() {
		System.out.println("面积："+ super.area);
		System.out.println("周长："+ super.per);
		System.out.println("半径："+ this.radius);
		System.out.println("颜色："+ super.color);
	}
	
}

