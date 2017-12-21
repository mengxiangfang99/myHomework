package com.neusoft.com.gaojiobject;

public class Tuzi {
	public static void main(String[] args) {
		int month = 5;
		int count1 = 1;
		int count2 = 1;
		for(int i = 3;i<=month;i++) {
			int count3;
			count3 = count1+count2;
			count1 = count2;
			count2 =count3;
			
			System.out.println(count2);
		}
		//1,1,2,3,5
	}
}
