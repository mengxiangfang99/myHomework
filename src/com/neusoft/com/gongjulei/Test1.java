package com.neusoft.com.gongjulei;

public class Test1 {
	public static void main(String[] args) {
		if(args.length > 0) {
			System.out.println("���������ĺ�Ϊ");
			System.out.println(Integer.parseInt(args[0])
					+Integer.parseInt(args[1]));
		}else {
			System.out.println("û��������������");
		}
		
	}
}
