package com.neusoft.com.gongjulei;

public class Test1 {
	public static void main(String[] args) {
		if(args.length > 0) {
			System.out.println("两个参数的和为");
			System.out.println(Integer.parseInt(args[0])
					+Integer.parseInt(args[1]));
		}else {
			System.out.println("没有输入两个参数");
		}
		
	}
}
