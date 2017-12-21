package com.neusoft.com.gaojiobject;

import java.util.Scanner;

public interface Fruit {
public static void main(String[] args) {
	
}
}

class Apple implements Fruit{
	public Apple() {
		System.out.println("创建了一个苹果类对象");
	}
}
class Banana implements Fruit{
	public Banana() {
		System.out.println("创建了一个香蕉类对象");
	}
}

class Grape implements Fruit{
	public Grape() {
		System.out.println("创建了一个葡萄类对象");
	}
}

class Gardener{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		creat(sc.next().toString().trim());
	}
	public static void creat(String fruit) {
		switch (fruit) {
		case "苹果":new Apple();
			 break;
		case "香蕉":new Banana();
			 break;
		case "葡萄":new Grape();
			 break;
		default : System.out.println("没有这种水果");
			 break;
		}
	}
}
