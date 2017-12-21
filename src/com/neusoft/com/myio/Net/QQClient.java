package com.neusoft.com.myio.Net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class QQClient {
	public static void main(String[] args) {
		System.out.println("王松已登录，开始运行");
		Socket s = null;
		Scanner sc = new Scanner(System.in);
		String sout = null;
		String sint = "王松猥琐的跟妹子说：";
		PrintWriter pw =  null;
		BufferedReader br = null;
		try {
			s = new Socket("localhost",7777);
			pw = new PrintWriter(s.getOutputStream());
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			while(true){
				sout = sint+ sc.nextLine();
				pw.println(sout);
				pw.flush();
				System.out.println(br.readLine());
				if(sout.contains("88")){
					break;
				}
			}						
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pw.close();
			sc.close();
			try {
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
