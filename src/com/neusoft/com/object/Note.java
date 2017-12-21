package com.neusoft.com.object;

public class Note {
	char color;
	int xh;
	public Note() {
		
	}
	public Note(char _color,int _xh) {
		this.color = _color;
		this.xh = _xh;
	}
	
	void show() {
		System.out.println("这是一本颜色为"+ this.color +"型号为"
				+ this.xh +"的笔记本");
	}
}
