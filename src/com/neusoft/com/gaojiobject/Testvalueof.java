package com.neusoft.com.gaojiobject;

public class Testvalueof {
	public static void main(String[] args) {
		Integer i1 = new Integer(111);
		Integer i2 = new Integer(111);
		Integer i3 = new Integer(222);
		Integer i4 = new Integer(222);

		Integer i5 = new Integer("111");
		Integer i6 = new Integer("111");
		Integer i7 = new Integer("222");
		Integer i8 = new Integer("222");
		
		Integer i01 = Integer.valueOf(111);
		Integer i02 = Integer.valueOf(111);
		Integer i03 = Integer.valueOf(222);
		Integer i04 = Integer.valueOf(222);

		Integer i05 = Integer.valueOf("111");
		Integer i06 = Integer.valueOf("111");
		Integer i07 = Integer.valueOf("222");
		Integer i08 = Integer.valueOf("222");
		
		System.out.println(i1.equals(i2));
		System.out.println(i01 == i02);
		System.out.println(i03 == i04);
		
		Integer a = 1;
		
		System.out.println(a-1);
		
		Object o = new Object();
		System.out.println(o.toString());
		System.out.println(o.hashCode());
		System.out.println(o.equals(o));
		System.out.println(o.getClass());
		
		
		Boolean b = new Boolean("true11");
		Character c1 = 'a';
		Character c2 = 'b';
		System.out.println(b);
		System.out.println(c1.compareTo(c2));
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isLetter('Ìì'));
		System.out.println(Character.isSpace(' '));
		System.out.println(Character.isWhitespace('\\'));
		System.out.println(Character.toLowerCase('a'));
		System.out.println(Character.toUpperCase('1'));
		
	}
}
