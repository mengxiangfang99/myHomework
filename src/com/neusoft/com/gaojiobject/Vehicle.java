package com.neusoft.com.gaojiobject;

public class Vehicle {
	private String brand;
	private String color;
	private double speed = 0;
	
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getSpeed() {
		return speed;
	}


	public void setSpeed(double speed) {
		this.speed = speed;
	}




	public Vehicle(){
	 

	}


	public Vehicle(String _brand,String _color,double _speed){
		this.brand = _brand;
		this.color = _color;
		this.speed = _speed;
	}


	public void run(){
		System.out.println(this.color+"颜色的"+this.brand+"在以"
		+this.speed+"的速度飞驰");
	}
	
	//主方法
	public static void main(String[] args) {
		Vehicle a = new Vehicle("benz","black",100);
		a.run();
		Car b = new Car("Hona","red",200,2);
		b.run();
	}
}

class Car extends Vehicle{
	int loader;
	
	public Car(String _brand,String _color,double _speed,
			int _loader) {
		super(_brand,_color,_speed);
		this.loader = _loader;
		
	}
	
	public void run() {
		System.out.println(super.getColor() + "颜色的" + super.getBrand()+"搭载"
	    + this.loader +"人在以" + super.getSpeed()+"的速度飞驰");
	}
}
