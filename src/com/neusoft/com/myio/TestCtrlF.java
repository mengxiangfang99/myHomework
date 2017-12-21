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
				System.out.println("·����Ϊ"+ls.getName()+"    Ŀ¼�ṹΪ: "
			+ls.getParent()+"    �ļ���С�� "+ls.length()+"    �ļ����ͣ� "+getfiletype(ls));
			}
		}
		
		
	}
	
	static String getfiletype(File f) {
		if(f.isDirectory()) {
			return "�ļ���";
		}
		
		String filename[] = f.getName().split("\\.");
		if(filename[filename.length-1].equals("txt")) {
			return "�ı��ĵ�";
		}else if(filename[filename.length-1].equals("doc")) {
			return "word";
		}else if(filename[filename.length-1].equals("rar")) {
			return "ѹ���ļ�";
		}else if(filename[filename.length-1].equals("xlsx")) {
			return "excel";
		}else {
			return "δ֪�ļ�";
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
