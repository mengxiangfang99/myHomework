package com.neusoft.com.one;

public class Fangfa {
	public static void main(String[] args) {

		fn(5);
		fn1(2004);
		fn2();
		fn3();
	}
	
	//1��дһ��������������n�Ľ׳ˣ�����5�Ľ׳���1*2*3*4*5.
	public static void fn(int a){
	  int result =1;
	  for(int i=a;i>0;i--){
	    result *= i;
	  }
	  System.out.println(result);
	}
	//2��дһ���������жϸ������ƽ�껹������
	public static void fn1(int year){
	  if((year%4 == 0 && year%100 != 0) || year%400 == 0){
	    System.out.println("����");
	  }else{
	    System.out.println("ƽ��");
	  }
	}

	//3��дһ���������������200����С������
	public static void fn2(){
	  int num =200;
	  out:while(true){
	    for(int i=2;i<num/2;i++){
	      if(num%i == 0)  
	    	  break ;
          if(i == num/2-1)
        	  break out;
	    }
	    num++;
	  }
	  
	  System.out.println(num);
	}
//	4дһ�����������ܣ�����һ��һά��int���飬�������⣬
//	Ȼ�����ǰ���С�����˳�������ʹ��ð�����򣩣�֪ʶ�㣺
//	�����Ķ���ͷ��ʣ�
	public static void fn3(){
	  int a[] = new int[]{2,13,4,5,6,7,1};
	  for(int i=1;i<a.length;i++){
	    for(int j=0;j<a.length-i;j++){
	      if(a[j]>a[j+1]){
	        int temp = a[j];
	        a[j] = a[j+1];
	        a[j+1] = temp;
	      }
	    }
	  }

	  for(int i=0;i<a.length;i++){
	    System.out.println(a[i]);
	  }
	}
	
}
