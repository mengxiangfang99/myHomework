package com.neusoft.com.gaojiobject;

public class Qiuyuan {
	static int num = 0;
	
	public static Qiuyuan create() {
		if(num < 11) {
			System.out.println("�����˵�"+ (num+1) +"����Ա����");
			num++;
			return new Qiuyuan();
		}else {
			System.out.println("��Ա�Ѿ���11��");
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
