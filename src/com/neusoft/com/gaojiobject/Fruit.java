package com.neusoft.com.gaojiobject;

import java.util.Scanner;

public interface Fruit {
public static void main(String[] args) {
	
}
}

class Apple implements Fruit{
	public Apple() {
		System.out.println("������һ��ƻ�������");
	}
}
class Banana implements Fruit{
	public Banana() {
		System.out.println("������һ���㽶�����");
	}
}

class Grape implements Fruit{
	public Grape() {
		System.out.println("������һ�����������");
	}
}

class Gardener{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		creat(sc.next().toString().trim());
	}
	public static void creat(String fruit) {
		switch (fruit) {
		case "ƻ��":new Apple();
			 break;
		case "�㽶":new Banana();
			 break;
		case "����":new Grape();
			 break;
		default : System.out.println("û������ˮ��");
			 break;
		}
	}
}
