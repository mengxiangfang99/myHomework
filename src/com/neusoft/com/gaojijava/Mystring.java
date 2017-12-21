package com.neusoft.com.gaojijava;

import java.io.UnsupportedEncodingException;

public class Mystring {
	public static void main(String[] args) {
		char []c1 = {'a','b','c'};
		String s1 = new String(c1);
		System.out.println(s1);
		
		String s20 = "";
		char[] c2 = {};
		String s2 = new String(c2);
		System.out.println(s20.equals(s2));
		
		String s3 = new String();
		byte []b = {1,2,3}; 
		String sb = new String(b);
		System.out.println(sb);
		System.out.println((char)1);
		
		String s4 = "12";
		String s41 = new String("12");
		
		String  s5 = new String(new String(new String(new String(new char[]{'a','b','c'}))));
		
		System.out.println(s5);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		String 	s6 = "adc°¡";
		try {
			byte b1 [] = s6.getBytes("utf-8");
			for (byte c : b1) {
				System.out.println(c);
			}
			for (int i = 0; i < b1.length; i++) {
				System.out.println(b1[i]);
			}
			
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			String siso8859 = new String(b1, "iso8859-1");
			System.out.println(siso8859);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			byte b2[] = siso8859.getBytes("iso8859-1");
			for (int i = 0; i < b2.length; i++) {
				System.out.println(b2[i]);
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			String sutf8 = new String(b2 , "utf-8");
			System.out.println(sutf8);
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
