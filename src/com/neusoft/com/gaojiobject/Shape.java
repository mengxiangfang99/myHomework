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

	//��ɫ
	public String getColor() {
		return this.color;
	};
	 
	public Shape() {
		
	}
	public Shape(String _color) {
		this.color = _color;
	}
	
	//���
	 abstract void getArea();
	//�ܳ�
	 abstract void getPer();
	 //��ʾ
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
		System.out.println("�����"+ super.area);
	};
	public void getPer(){
		System.out.println("�ܳ���"+ super.per);
	};
	public void showAll(){
		System.out.println("�����"+ super.area);
		System.out.println("�ܳ���"+ super.per);
		System.out.println("�߶ȣ�"+ this.height);
		System.out.println("��ȣ�"+ this.width);
		System.out.println("��ɫ��"+ super.color);
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
		System.out.println("�����"+ super.area);
	}

	void getPer() {
		System.out.println("�ܳ���"+ super.per);
	}

	void showAll() {
		System.out.println("�����"+ super.area);
		System.out.println("�ܳ���"+ super.per);
		System.out.println("�뾶��"+ this.radius);
		System.out.println("��ɫ��"+ super.color);
	}
	
}

