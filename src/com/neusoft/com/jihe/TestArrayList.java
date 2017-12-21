package com.neusoft.com.jihe;

import java.util.ArrayList;
import java.util.Date;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(2);
		al.add("$");
		al.add(new Date());
		
		//System.out.println(al.get(2));
		
		ArrayList al1 = new ArrayList();
		
		al.add(1,"a");
		al1.add(5);
		al1.add(6);
		al.add("1");
		al.add("$");
		al.addAll(al1);
		
//		al.clear();
		System.out.println(al.contains("b"));
		System.out.println(al.indexOf(6));
//		System.out.println(al.isEmpty());
//		System.out.println(al.remove(2));
//		System.out.println(al.remove("$"));
//		System.out.println(al.set(1,"2"));
//		System.out.println(al.remove("3"));
//		System.out.println(al.toString());
//		System.out.println(al.toArray()[1]);
	}
}
