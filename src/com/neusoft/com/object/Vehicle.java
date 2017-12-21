package com.neusoft.com.object;

public class Vehicle {
	private String brand;
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


	private String color;
	private double speed = 0;


	public Vehicle(){
	 

	}


	public Vehicle(String _brand,String _color,double _speed){
		this.brand = _brand;
		this.color = _color;
		this.speed = 0;
	}


	public void run(){
		System.out.println(this.color+"颜色的"+this.brand+"在以"
		+this.speed+"的速度飞驰");
	}
}
