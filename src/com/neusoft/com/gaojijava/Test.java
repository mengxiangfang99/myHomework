package com.neusoft.com.gaojijava;

import java.io.UnsupportedEncodingException;

public class Test {
	public static void main(String[] args) {
		char b[]  = {'a','b','c'};
		String s = new String(b);
		System.out.println(s);
		byte c[] = s.getBytes();
		System.out.println(s.getBytes());
		
		String s1;
		try {
			s1 = new String(c,"gbk");
			System.out.println(s1);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
}
