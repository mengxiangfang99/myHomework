package com.neusoft.com.one;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DisizhangSuzu {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print(sc.next());
		int a[] = {1,2,3,4,5,6,7};
		int b[] = {11,22,33,44,55,66,77};
		
		//System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(a, 6, b, 6, 1);
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+"\t");
		}

		System.out.println();
		//Arrays.sort(arr_name,fromIndex,toIndex)
		Arrays.sort(b);
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+"\t");
		}

		System.out.println();
		//��дһ���򵥳���Ҫ�����鳤��Ϊ5���ֱ�ֵ10��20��30��40��50���ڿ���̨
		//����������ֵ��֪ʶ�㣺���鶨��ʹ�����һά�����ʼ����
		System.out.println("~~~~~~~~~~~~");
//		int []c;
//		c = new int[5];
//		c[0]= 10;
//		c[1]= 20;
//		c[2]= 30;
//		c[3]= 40;
//		c[4]= 50;
//		for(int i=0;i<c.length;i++) {
//			System.out.print(c[i]+' ');
//		}
		/*��һ���ַ������ֵ��neusofteducation����������һ���ַ�����
		 * �С������鸴�ƣ�
		 * */
		System.out.println();
		System.out.println("~~~~~~~~~~~~");
	    char[] b2 = {'n','e','u','s','o','f','t','e','d','u','c','a'
	    		,'t','i','o','n'};

	    char[] c2;
	    //char[] c2 = new char[b2.length];
	    c2 = b2;
	    for(int i=0;i<c2.length;i++) {
	    	System.out.print(c2[i]);
	    }
	    /*3����һ����9��������1��6��2��3��9��4��5��7��8�������飬
		������Ȼ����������������ֵ����Arrays.sort����ð������*/
		System.out.println();
		System.out.println("3~~~~~~~~~~~~");
		int[] a3 = {1,6,2,3,9,4,5,7,8};
		Arrays.sort(a3);
		
		for(int i=0;i<a3.length;i++) {
			System.out.print(a3[i]+" ");
		}
		
		for(int i=1;i<a3.length;i++) {
			for(int j=0;j<a3.length-i;j++) {
				if(a3[j]>a3[j+1]) {
					int temp = a3[j];
					a3[j] = a3[j+1];
					a3[j+1] = temp;
				}
			}
		}
		System.out.println();
		for(int i=0;i<a3.length;i++) {
			System.out.print(a3[i]+" ");
		}
	    
		/*
		 * */
		System.out.println();
		System.out.println("4~~~~~~~~~~~~");
		
		int[][] a4 = {{2,3,4},{4,6,8}};
		int[][] b4 = {{1,5,2,8},{5,9,10,-3},{2,7,-5,-18}};
		
		int[][] c4 = new int[2][4];
		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++) {
				for(int k=0;k<3;k++) {
					c4[i][j] += a4[i][k] * b4[k][j];
				}
			}
		}
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(c4[i][j]+"\t");
			}
			System.out.println();
		}
		
		/*5���һ��double�Ͷ�ά���飨���ȷֱ�Ϊ5��4ֵ�Լ��趨����ֵ��
		��֪ʶ�㣺���鶨��ʹ�������ά�����ʼ�������������
		 * */

		System.out.println();
		System.out.println("5~~~~~~~~~~~~");
		double[][] a5 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},
				{14,15,16,17},{18,19,20,21}};
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(a5[i][j]+"\t");
			}
			System.out.println();
		}
		/*
		 * 
			6��һ����8��������18��25��7��36��13��2��89��63�����������ҳ�
			���������������±���֪ʶ�㣺�������������Ԫ�ط��ʣ�
		 * */
		System.out.println();
		System.out.println("6~~~~~~~~~~~~");
		
		int[] a6 = {18,25,7,36,13,2,89,63};
		int maxi = 0;
		for(int i=0;i<a6.length;i++) {
			if(a6[maxi] < a6[i]) {
				maxi = i;
			}
		}
		
		System.out.println("�������"+a6[maxi]+"�����±���"+maxi);
		
//		for(int i=1;i<a6.length;i++) {
//			for(int j=0;j<a6.length-1;j++) {
//				if(a6[j]>a6[j+1]) {
//					int temp = a6[j];
//					a6[j] = a6[j+1];
//					a6[j+1] = temp;
//				}
//			}
//		}
		
		/*7��һ�������е�Ԫ�������ţ�֪ʶ�㣺�������������Ԫ�ط��ʣ�
		 * */
		System.out.println();
		System.out.println("7~~~~~~~~~~~~");
		
		int[] a7 = {1,2,3,4,5,6};
		for(int i=0;i<a7.length/2;i++) {
			int temp = a7[i];
			a7[i] = a7[a7.length-i-1];
			a7[a7.length-i-1] = temp;
		}
		
		for(int i=0;i<a7.length;i++) {
			System.out.print(a7[i]+" ");
		}
		
		/*8��һ�������е��ظ�Ԫ�ر���һ�����������㣨֪ʶ�㣺�������������Ԫ�ط��ʣ�*/
		System.out.println();
		System.out.println("8~~~~~~~~~~~~");
		
		int[] a8 = {1,1,3,4,5,6,6,7};
		
		for(int i=0;i<a8.length;i++) {
			if(i != a8.length-1) {
				for(int j=i+1;j<a8.length-1;j++) {
					if(a8[i] == a8[j]) {
						a8[j] = 0;
					}
				}
			}
		}
		
		for(int i=0;i<a8.length;i++) {
			System.out.print(a8[i]+" ");
		}
		/*9����һά����{-10��2��3��246��-100��0��5}������������е�
                           ƽ��ֵ�����ֵ����Сֵ����֪ʶ�㣺�������������Ԫ�ط��ʣ�
		 * */
		System.out.println();
		System.out.println("9~~~~~~~~~~~~");
		
		int[] a9 = {-10,2,3,246,-100,0,5};
		int maxi9 =0;
		int mini9 =0;
		int sum9 = 0;
		for(int i=0;i<a9.length;i++) {
			if(a9[maxi9]<a9[i]) {
				maxi9 = i;
			}
			if(a9[mini9]>a9[i]) {
				mini9 = i;
			}
			sum9 += a9[i];
				
		}
		System.out.println("���ֵ"+a9[maxi9]+"��Сֵ"+a9[mini9]+"ƽ��ֵ"+
		(double)sum9/a9.length);
	}
}
