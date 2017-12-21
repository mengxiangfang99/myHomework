package com.neusoft.com.myio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Testcopy {
	public static void main(String[] args) throws IOException {
		File f = new File("g:/aa.txt");
		File f2 = new File("g:/aa1.txt");
		
		FileReader fr = new FileReader(f);
		FileWriter fw = new FileWriter(f2);
		
		int a = fr.read();
		while(a!=-1) {
			fw.write(a);
			a = fr.read();
		}
		fw.flush();
		fw.close();
		fr.close();
	}
}
