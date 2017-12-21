package com.neusoft.com.gongjulei;

import java.util.Arrays;
import java.util.Random;

public class Test3 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] a = new int[10];
		
		for (int i = 0; i < 10; i++) {
			a[i] = r.nextInt(101);
		}
		
		Arrays.sort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
