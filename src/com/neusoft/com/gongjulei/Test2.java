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
			System.out.println("����ַ�������"+ count +"��e�ַ�");
			
		}
		System.out.println("�������");
	}
}
