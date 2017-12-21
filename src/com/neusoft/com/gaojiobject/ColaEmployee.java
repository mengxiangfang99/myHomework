package com.neusoft.com.gaojiobject;

import java.util.Iterator;

public class ColaEmployee {
	String name;
	String birthday;
	
	public ColaEmployee() {
		
	}
	public ColaEmployee(String _name, String _birthday) {
		this.name = _name;
		this.birthday = _birthday;
	}
	
	double getSalary(int month){
		return 0.0;
	};
	
	public static void main(String[] args) {
		ColaEmployee[] a = new ColaEmployee[6];
		a[0] = new SalariedEmployee("����","1589-02-11",100);
		a[1] = new SalariedEmployee("����1","1589-02-11",100);
		a[2] = new HourlyEmployee("����2","1589-03-11",100,100);
		a[3] = new HourlyEmployee("����3","1589-04-11",100,100);
		a[4] = new SalesEmployee("����4","1589-05-11",100,0.5);
		a[5] = new SalesEmployee("����5","1589-12-11",100,0.5);
		
		for (ColaEmployee colaEmployee : a) {
		    System.out.println(colaEmployee.name+" 12�¹���"+ 
			colaEmployee.getSalary(12) +"Ԫ");
		}
	}
}

class SalariedEmployee extends ColaEmployee{
	public SalariedEmployee() {};
	public SalariedEmployee(String _name,String _birthday, double _monthpay) {
		super(_name,_birthday);
		this.monthpay = _monthpay;
	};
	
	double monthpay;
	
	double getSalary(int month){
		if(this.birthday.split("-")[1].equals(month+"")) {
			monthpay += 100;
		}
		return monthpay;
	};
}

class HourlyEmployee extends ColaEmployee{
	double hourpay;
	double monthworkhour;
	
	public HourlyEmployee() {};
	public HourlyEmployee(String _name,String _birthday,double _hourpay,
			double _monthworkhour) {
		super(_name,_birthday);
		this.hourpay = _hourpay;
		this.monthworkhour = _monthworkhour;
		
	}
	double getSalary(int month){
		double pay = 0;
		//���ն��
		if(this.birthday.split("-")[1].equals(month+"")) {
			pay += 100;
		}
		//�Ӱ���
		if(monthworkhour > 160) {
			pay += (monthworkhour - 160)*1.5*hourpay+160 * hourpay;
		}else {
			pay += hourpay*monthworkhour;
		}
			
		return pay;
	};
}

class SalesEmployee extends ColaEmployee{
	double monthsale;
	double rate;
	
	public SalesEmployee() {};
	public SalesEmployee(String _name,String _birthday,double _monthsale,
			double _rate) {
		super(_name,_birthday);
		this.monthsale = _monthsale;
		this.rate = _rate;
	};
	
	double getSalary(int month){
		double pay = 0;
		if(this.birthday.split("-")[1].equals(month+"")) {
			pay += 100;
		}
		pay += monthsale * rate;
		return pay;
	};
}

class Company {
	

}

