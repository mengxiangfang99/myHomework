package com.neusoft.com.myio.Thread;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Writing implements Runnable{
	private Socket s;	
	public Writing(Socket s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		write();
	}
	
	void write(){
		PrintWriter pw =  null;
		Scanner sc = new Scanner(System.in);
		String sout = null;
		try {
			pw = new PrintWriter(s.getOutputStream());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while(true){
			sout =  sc.nextLine();
			pw.println(sout);
			pw.flush();
			
			if(sout.contains("88")){
				break;
			}
		}		
		

	}

}
