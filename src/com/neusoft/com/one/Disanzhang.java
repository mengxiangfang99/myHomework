package com.neusoft.com.one;

public class Disanzhang {
	public static void main(String[] args) {
//		int x = 3;
//		if(x%2 == 0) {
//			System.out.println("输入的数值"+x+"是偶数");
//		}else {
//			System.out.println(x);
//		}
		
		//计算1+2+3+...+100的和（提示利用while语句）
//		int sum = 0;
//		int i = 1;
//		while(i <= 100){
//			sum += i;
//			i++;
//		}
//		System.out.println(sum);
		

		//计算从1到100的所有奇数相加（提示利用while语句）
		
//		int sum = 0;
//		int i = 1;
//		while(i <= 100) {
//			sum += i;
//			i += 2;
//		}
//		System.out.println(sum);
		
		//5用do while 循环来改写1加到100
		
//		int sum = 0;
//		int i = 1;
//		do {
//			sum += i++;
//		}while(i<=100);
//		System.out.println(sum);
		
		//6用for循环来改写1加到100
		
//		int sum = 0;
//		for(int i = 1; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		//7用for循环改写从1到100的所有奇数相加的和
		
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
//		System.out.print("奖金为："+sal);

		//猴子
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
		//switch 等级
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
//		System.out.println("第10年工资"+salAfter);
//		System.out.println("10年工资"+sum10);
		
		//5
//		int num = 2;
//		if((int)(num & 1) == 1) {
//			System.out.println("奇数");
//		}else {
//			System.out.println("偶数");
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
//			System.out.println("能被5和6整除");
//		}else if(num56%5 != 0 && num56%6 == 0) {
//			System.out.println("不能被5,能被6整除");
//		}else if(num56%5 == 0 && num56%6 != 0) {
//			System.out.println("能被5整除,不能被6整除");
//		}else {
//			System.out.println("不能被5和6整除");
//		}
		
		//8
//		int year = 1900;
//		if((year%4 == 0 && year%100 != 0) || (year%400 == 0)) {
//			System.out.println("闰年");
//		}else {
//			System.out.println("非闰年");
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
//		System.out.println("个位是"+_5num%10);
//		if(_5num>=10) {
//			System.out.println("十位是"+_5num/10%10);
//		}
//		if(_5num>=100) {
//			System.out.println("百位是"+_5num/100%10);
//		}
//		if(_5num>=1000) {
//			System.out.println("千位是"+_5num/1000%10);
//		}
//		if(_5num>=10000) {
//			System.out.println("万位是"+_5num/10000%10);
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
