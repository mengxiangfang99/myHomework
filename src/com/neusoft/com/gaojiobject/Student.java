package com.neusoft.com.gaojiobject;

public class Student {
	int id;
	String name;
	char sex;
	int age;
	double score; 
	
	
	public Student() {
	}


	public Student(int _id, String _name, char _sex, int _age) {
		super();
		this.id = _id;
		this.name = _name;
		this.sex = _sex;
		this.age = _age;
	}


	void showScore() {
		System.out.println("学号："+ this.id +" 姓名："+ this.name 
				+" 性别："+ this.sex +" 年龄："+ this.age +" 综合成绩："+ this.score);
	};
	
	public static void main(String[] args) {
		
	}
}

class EnglishStu extends Student{
	double speakingscore;
	double middletestscore;
	double lasttestscore;
	
	public EnglishStu() {};
	public EnglishStu(int _id,String _name, char _sex,int _age,
			double _speakingscore,double _middletestscore,double _lasttestscore) {
		super(_id,_name,_sex,_age);
		this.speakingscore = _speakingscore;
		this.middletestscore = _middletestscore;
		this.lasttestscore = _lasttestscore;
		super.score  =0.5* this.speakingscore + 0.25 * this.middletestscore
				+ 0.25 * this.lasttestscore;
	};

}

class ComputerStu extends Student{
	double handlescore;
	double Englistwritingscore;
	double middletestscore;
	double lasttestscore;
	
	public ComputerStu() {};
	public ComputerStu(int _id,String _name, char _sex,int _age,
			double _handlescore,double _Englistwritingscore,double _middletestscore,
			double _lasttestscore) {
		super(_id,_name,_sex,_age);
		this.handlescore = _handlescore;
		this.Englistwritingscore = _Englistwritingscore;
		this.middletestscore = _middletestscore;
		this.lasttestscore = _lasttestscore;
		super.score  =0.4* this.handlescore + 0.2 * this.Englistwritingscore
				+ 0.2 * this.middletestscore + 0.2 * this.lasttestscore;
	};
}

class literStu extends Student{
	double speakingscore;
	double workscore;
	double middletestscore;
	double lasttestscore;
	
	public literStu() {};
	public literStu(int _id,String _name, char _sex,int _age,
			double _speakingscore,double _workscore,double _middletestscore,
			double _lasttestscore) {
		super(_id,_name,_sex,_age);
		this.speakingscore = _speakingscore;
		this.workscore = _workscore;
		this.middletestscore = _middletestscore;
		this.lasttestscore = _lasttestscore;
		super.score  =0.35* this.speakingscore + 0.35 * this.workscore
				+ 0.15 * this.middletestscore + 0.15 * this.lasttestscore;
	};
	
}
