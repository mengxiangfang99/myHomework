package com.neusoft.com.gongjulei;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test4 {
	public static void main(String[] args) {
		//String s= "2017-11-11 11:22:22";
		Date d = new Date(2017,11,11,11,22,22);
		Date d1 = (Date) d.clone();
		d1.setHours(d.getHours()-7);
		d1.setYear(d.getYear()-1900);
		Date d2 = (Date) d.clone();
		d2.setHours(d.getHours()+12);
		d2.setYear(d.getYear()-1900);

		System.out.println("巴黎时间"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(d1));
		System.out.println("纽约时间"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(d2));
		
//		Calendar c = Calendar.getInstance();
//		c.setTime(d);
//		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		
//		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
//		System.out.println(new Date());
	}
}
