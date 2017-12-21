package com.neusoft.com.gongjulei;

public class Test8 {
	public static void main(String[] args) {
		String s = "affadaffa";
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length/2; i++) {
			if(c[i] != c[c.length-1-i]) {
				System.out.println("不是回文数");
				return;
			}
			if((i >= c.length/2-1)) {
				System.out.println("是回文数");
			}
		}
	}
}
