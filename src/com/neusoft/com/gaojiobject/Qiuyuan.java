package com.neusoft.com.gaojiobject;

public class Qiuyuan {
	static int num = 0;
	
	public static Qiuyuan create() {
		if(num < 11) {
			System.out.println("创建了第"+ (num+1) +"个球员对象");
			num++;
			return new Qiuyuan();
		}else {
			System.out.println("球员已经有11个");
			return null;
		}
	} 
	
	private Qiuyuan() {};
	
	public static void main(String args[]) {
		for(int i =0;i<12;i++) {
			Qiuyuan a = Qiuyuan.create();
			System.out.println(a);
		}
	}
}
