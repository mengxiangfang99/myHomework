package com.neusoft.com.one;

public class Fangfa {
	public static void main(String[] args) {

		fn(5);
		fn1(2004);
		fn2();
		fn3();
	}
	
	//1编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5.
	public static void fn(int a){
	  int result =1;
	  for(int i=a;i>0;i--){
	    result *= i;
	  }
	  System.out.println(result);
	}
	//2编写一个方法，判断该年份是平年还是闰年
	public static void fn1(int year){
	  if((year%4 == 0 && year%100 != 0) || year%400 == 0){
	    System.out.println("闰年");
	  }else{
	    System.out.println("平年");
	  }
	}

	//3编写一个方法，输出大于200的最小的质数
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
//	4写一个方法，功能：定义一个一维的int数组，长度任意，
//	然后将他们按从小到大的顺序输出（使用冒泡排序）（知识点：
//	方法的定义和访问）
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
