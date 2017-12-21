package com.neusoft.com.myio;

import java.io.File;
import java.util.ArrayList;

public class TestCtrlF {
	static ArrayList<File> al = new ArrayList<File>();
	
	public static void main(String[] args) {
		String filename = "1";
		String parentName = "g:/haha";
		printDir(parentName);
		for (File ls : al) {
			if(ls.getName().contains(filename)) {
				System.out.println("路径名为"+ls.getName()+"    目录结构为: "
			+ls.getParent()+"    文件大小： "+ls.length()+"    文件类型： "+getfiletype(ls));
			}
		}
		
		
	}
	
	static String getfiletype(File f) {
		if(f.isDirectory()) {
			return "文件夹";
		}
		
		String filename[] = f.getName().split("\\.");
		if(filename[filename.length-1].equals("txt")) {
			return "文本文档";
		}else if(filename[filename.length-1].equals("doc")) {
			return "word";
		}else if(filename[filename.length-1].equals("rar")) {
			return "压缩文件";
		}else if(filename[filename.length-1].equals("xlsx")) {
			return "excel";
		}else {
			return "未知文件";
		}
	}
	static void printDir(String parentName) {
		File f = new File (parentName);
		File [] f1 = f.listFiles();
		for (File file : f1) {
			if(file.isDirectory()) {
				printDir(file.getAbsolutePath());
			}
			al.add(file);
		}
	}
}
