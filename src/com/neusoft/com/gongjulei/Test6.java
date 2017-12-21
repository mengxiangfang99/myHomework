package com.neusoft.com.gongjulei;

public class Test6 {
	static int count = 0;
	static void find(String s1 ,String s2) {
		if(s1.indexOf(s2) > -1 && 
				s1.indexOf(s2)+s2.length() <= s1.length()){
			count++;
			find(s1.substring(s1.indexOf(s2)+s2.length()),s2);
		}else {
			return;
		}
	}
	
	public static void main(String[] args) {
		String sf = "fda fdg";
		String ss = "g";
		
		Test6.find(sf, ss);
		System.out.println("共出现"+ count +"次");
	}
}
