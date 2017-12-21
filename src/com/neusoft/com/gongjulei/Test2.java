package com.neusoft.com.gongjulei;

public class Test2 {
	public static void main(String[] args) {
		if(args.length > 0) {
			String s = args[0];
			char[] c = s.toCharArray();
			int count = 0;
			for (int i = 0; i < c.length; i++) {
				if(c[i] == 'e')
					count++;
			}
			System.out.println(s);
			System.out.println("这个字符串中有"+ count +"个e字符");
			
		}
		System.out.println("输入参数");
	}
}
