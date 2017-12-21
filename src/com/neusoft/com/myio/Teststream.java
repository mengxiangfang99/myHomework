package com.neusoft.com.myio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Teststream {
	public static void main(String[] args) throws IOException {
		File f = new File("g:/aa.txt");
		f.createNewFile();
//		int a = 1;
//		FileOutputStream os = new FileOutputStream(f);
//		os.write(a);
//		System.out.println((char)a);
		

		FileWriter fw = new FileWriter(f);
		fw.write("a");
		fw.flush();
		fw.close();
		
		
	}
}
