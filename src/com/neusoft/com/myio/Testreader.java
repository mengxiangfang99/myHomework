package com.neusoft.com.myio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Testreader {
	public static void main(String[] args) throws IOException {
		File f = new File("g:/aa.txt");
		FileInputStream fis = new FileInputStream(f);

		byte[] b1 = new byte[1];
		byte[] b2 = new byte[1];
//		byte[] b3 = new byte[1];
//		byte[] b4 = new byte[1];
	
		fis.read(b1);
		fis.read(b2);
//		fis.read(b3);
//		fis.read(b4);
		
		System.out.println(b1[0]);
		System.out.println(b2[0]);
//		System.out.println(b3[0]);
//		System.out.println(b4[0]);
	}
}
