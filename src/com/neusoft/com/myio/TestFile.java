package com.neusoft.com.myio;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class TestFile {
	public static void main(String[] args) {
		//创造路径
		File f = new File("g:/2.txt");
		
		File f2 = new File("g:/1");
		
		//在路径上造点啥
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//f2.createNewFile();
		f2.mkdir();
		System.out.println(f2.mkdirs());
		
		//造的东西能干啥
		System.out.println(f.canExecute());
		//java中的File类从来就不是文件的意思：路径类
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		
		//路径信息
		//f.deleteOnExit();
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		System.out.println(f.getParent());
		
		//造的东西是个啥
		System.out.println(f2.isDirectory());
		System.out.println(f2.isFile());
		System.out.println(f.isHidden());
		System.out.println(f.length());
		
		//造的东西里面还有啥
		String sf[] = f2.list();
		for (String string : sf) {
			System.out.println(string);
		}
		
		File sff[] = f2.listFiles();
		for (File file : sff) {
			System.out.println(file);
		}
		
		System.out.println("g:"+f.separator+"1.txt");
	}
}
