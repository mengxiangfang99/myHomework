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
		System.out.println("����һ����ɫΪ"+ this.color +"�ͺ�Ϊ"
				+ this.xh +"�ıʼǱ�");
	}
}
