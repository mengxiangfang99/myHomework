package com.neusoft.com.myio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Testreader1 {
	public static void main(String[] args) throws IOException {
		File f = new File("g:/aa.txt");
		FileReader fr = new FileReader(f);
		int a = fr.read();
		while(a!=-1) {
			System.out.println((char)a);
			a = fr.read();
		}
	}
}
