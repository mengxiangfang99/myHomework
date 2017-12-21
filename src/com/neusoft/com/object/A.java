package com.neusoft.com.object;

public class A {
	String a = "aa";
	public void sayHello() {
		System.out.println("hello in a");
	};
}
class B extends A{
	String a = "bb";
	String b = "b in B";
	public int sayHello(int a) {
		System.out.println("hello in b");
		return 1;
	}
}
class ABTest{
	public static void main(String[] args) {
		B a = new B();
		//System.out.println(a.b);
		a.sayHello(1);
	}
	
}
