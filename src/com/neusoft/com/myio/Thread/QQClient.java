package com.neusoft.com.myio.Thread;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class QQClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("王松已登录，开始运行");
		Socket s = null;
		Scanner sc = new Scanner(System.in);
		String sout = null;
		String sint = "王松猥琐的跟妹子说：";
		s = new Socket("localhost",7777);
		Reading r = new Reading(s);
		Writing w = new Writing(s);
		Thread read = new Thread(r);
		Thread write = new Thread(w);
		read.start();
		write.start();	
	
	}
}
