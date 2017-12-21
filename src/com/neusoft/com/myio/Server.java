package com.neusoft.com.myio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.InputStream;

//import org.omg.CORBA.portable.InputStream;

public class Server {
	public static void main(String[] args) throws IOException {
		String brStr = null;
		String ssay = null;
		Scanner sc =new Scanner(System.in);
		ServerSocket ss = new ServerSocket(8888);
		Socket s = ss.accept();
		InputStream is = s.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(os);
		
		while(true) {
			brStr = br.readLine();
			System.out.println("¿Í»§¶ËËµ£º " + brStr);
			
			ssay = sc.nextLine();
			pw.println(ssay);
			pw.flush();
			
			if(brStr.contains("exit") || ssay.contains("exit"))
				break;
		}
		is.close();
		s.close();
		ss.close();
		
		pw.close();
		os.close();
		s.close();
		
	}
}
