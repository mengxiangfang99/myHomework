package com.neusoft.com.myio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner sc = new Scanner(System.in);
		String csay = null;
		String str = null;
		String brStr = null;
		
		Socket s = new Socket("localhost",8888);
		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(os);
		

		InputStream is = s.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		
		while(true){
			csay = sc.nextLine();
			pw.println(csay);
			pw.flush();
			
			brStr = br.readLine();
			System.out.println("·þÎñÆ÷Ëµ£º "+brStr);
			
			if(brStr.contains("exit") || csay.contains("exit")) break;
		}
		pw.close();
		os.close();
		s.close();
		
		is.close();
		s.close();
		
	}
}
