package com.neusoft.com.one;

public class Disanzhang {
	public static void main(String[] args) {
//		int x = 3;
//		if(x%2 == 0) {
//			System.out.println("�������ֵ"+x+"��ż��");
//		}else {
//			System.out.println(x);
//		}
		
		//����1+2+3+...+100�ĺͣ���ʾ����while��䣩
//		int sum = 0;
//		int i = 1;
//		while(i <= 100){
//			sum += i;
//			i++;
//		}
//		System.out.println(sum);
		

		//�����1��100������������ӣ���ʾ����while��䣩
		
//		int sum = 0;
//		int i = 1;
//		while(i <= 100) {
//			sum += i;
//			i += 2;
//		}
//		System.out.println(sum);
		
		//5��do while ѭ������д1�ӵ�100
		
//		int sum = 0;
//		int i = 1;
//		do {
//			sum += i++;
//		}while(i<=100);
//		System.out.println(sum);
		
		//6��forѭ������д1�ӵ�100
		
//		int sum = 0;
//		for(int i = 1; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		//7��forѭ����д��1��100������������ӵĺ�
		
//		int sum = 0;
//		for(int i = 1; i <= 100; i += 2) {
//			sum += i;
//		}
//		System.out.println(sum);
		

		
//		double x=50d;
//		double sal = 0d;
//		double WAN = 10000D;
//		if(x <= 10*WAN) {//<10wan
//			//0.1
//			sal = 0.1 * x;
//		}else if(x > 10*WAN && x <= 20*WAN){
//			//>10wan < 20wan
//			//0.075
//			sal = 0.1 * 10*WAN + 0.075 * (x - 10 * WAN);
//		}else if(x > 20*WAN && x <= 40*WAN){
//			//>20wan < 40wan
//			//0.05
//			sal = 0.1 * 10 * WAN + 0.075 * 10 * WAN
//					+0.05 * (x - 20 * WAN);
//		}else if(x > 40*WAN && x <= 60*WAN){
//			//>40wan <60wan
//			//0.03
//			sal = 0.1 * 10*WAN + 0.075 * 10*WAN
//					+ 0.05*20*WAN + 0.03*(x - 40*WAN);
//		}else if(x > 60*WAN && x <= 100*WAN){
//			//>60wan <100wan
//			//0.015
//			sal = 0.1 * 10*WAN + 0.075 * 10*WAN
//					+ 0.05*20*WAN + 0.03*20*WAN
//					+ 0.015*(x - 60*WAN);
//		}else {
//			//>100wan
//			//0.01
//			sal = 0.1 * 10*WAN + 0.075 * 10*WAN
//					+ 0.05*20*WAN + 0.03*20*WAN
//					+ 0.015*40*WAN+0.01*(x - 100*WAN);
//		}
//		System.out.print("����Ϊ��"+sal);

		//����
//		int day = 9;
//		int sum = 1;
//		// day 9 sum = 1;
//		while(day>=1){
//			sum = (1+sum)*2;
//			day--;
//		}
//		System.out.println(sum);
		
		//16
//		int num = 200;
//        for(int i = 1;;i++) {
//        	int firstZhiAfter200 = num + i;
//        	for(int j = 2;j < firstZhiAfter200/2;j++) {
//        		if(firstZhiAfter200%j == 0) {
//        			break;
//        		}
//        		if(j+1 >= firstZhiAfter200/2) {
//        			System.out.println("getIt:"+firstZhiAfter200);
//        			return;
//        		}
//        	}
//        }
//		A :90 100
//		B 80 89
//		C 70 79
//		D 60 69
//		E 0 59
		//switch �ȼ�
//		int a = 100;
//		switch(a/10) {
//		case 10 :;
//		case 9 :System.out.println('A');
//		break;
//		case 8 :System.out.println('B');
//		break;
//		case 7 :System.out.println('C');
//		break;
//		case 6 :System.out.println('D');
//		break;
//		default:System.out.println('E');
//		}
		
		//3
//		double sal = 3000d;
//		double salAfter = 0;
//		double sum10 = sal;
//		for(int i = 1;i<10;i++) {
//			sal = 1.06d*sal;
//			salAfter = sal;
//			sum10 += salAfter;
//		}
//		System.out.println("��10�깤��"+salAfter);
//		System.out.println("10�깤��"+sum10);
		
		//5
//		int num = 2;
//		if((int)(num & 1) == 1) {
//			System.out.println("����");
//		}else {
//			System.out.println("ż��");
//		}
		
		//6
//		int x = 0;
//		if(x == 1) {
//			System.out.println(1);
//		}else if(x == 5) {
//			System.out.println(5);
//		}else if(x == 10) {
//			System.out.println(10);
//		}else {
//			System.out.println("x=none");
//		}
		
		//7
//		int num56 = 9;
//		if(num56%5 == 0 && num56%6 == 0) {
//			System.out.println("�ܱ�5��6����");
//		}else if(num56%5 != 0 && num56%6 == 0) {
//			System.out.println("���ܱ�5,�ܱ�6����");
//		}else if(num56%5 == 0 && num56%6 != 0) {
//			System.out.println("�ܱ�5����,���ܱ�6����");
//		}else {
//			System.out.println("���ܱ�5��6����");
//		}
		
		//8
//		int year = 1900;
//		if((year%4 == 0 && year%100 != 0) || (year%400 == 0)) {
//			System.out.println("����");
//		}else {
//			System.out.println("������");
//		}
		
		//10
//		int a=3,b=2,c=1;
//		if(a > b) {
//			if(a > c) {
//				if(b>c) {
//					System.out.println("abc");
//				}else {
//					System.out.println("acb");
//				}
//			}else {
//				System.out.println("cab");
//			}
//		}
		
	   //11
//		int _5num = 1;
//		System.out.println("��λ��"+_5num%10);
//		if(_5num>=10) {
//			System.out.println("ʮλ��"+_5num/10%10);
//		}
//		if(_5num>=100) {
//			System.out.println("��λ��"+_5num/100%10);
//		}
//		if(_5num>=1000) {
//			System.out.println("ǧλ��"+_5num/1000%10);
//		}
//		if(_5num>=10000) {
//			System.out.println("��λ��"+_5num/10000%10);
//		}
		
		//17
//		int num4wei = 9250;
//		int ge = num4wei%10;
//		int shi = num4wei/10%10;
//		int bai = num4wei/100%10;
//		int qian = num4wei/1000%10;
//		int result =ge*1000+shi*100+bai*10+qian;
//		System.out.println(result);
		
		//12
//		int money = 79;
//		double huifei = 0;
//		if(money < 100) {
//			huifei = 1;
//		}else if(money>=100 && money<=5000) {
//			huifei = 0.01*money;
//		}else if(money>5000) {
//			huifei = 50;
//		}
//		System.out.println(huifei);
		
		//13
//		int sum = 0;
//		for(int i=1;i<=100;i++) {
//			if(i%3 == 0) {
//				sum += i;
//			}
//		}
		
//		int i = 1;
//		int sum = 0;
//		do {
//			if(i%3 == 0) {
//				sum += i;
//			}
//			i++;
//		}while(i<=100);
		
//		int i = 1;
//		int sum = 0;
//		while(i<=100) {
//			if(i%3==0) {
//				sum += i;
//			}
//			i++;
//		}
//		System.out.println(sum);
		//14
//		for(int i=0;i<10;i++) {
//			if(i == 5) {
//				continue;
//			}
//			System.out.println(i);
//		}
		//15
		int a = 4;
		int temp = a;
		int total = 1;
		while(temp != 0) {
			total *= temp;
			temp--;
		}
		System.out.println(total);
	}
}
