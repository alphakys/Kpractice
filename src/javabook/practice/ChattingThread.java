package javabook.practice;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChattingThread implements Runnable {
	
	Socket s;
	
	
	ChattingThread(){}
	
	ChattingThread(Socket s){
		this.s = s;
	}
	
	
	
	
	@Override
	public void run() {
		
		try {
		InputStream is = s.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		
		
		while(true) {
			
			
			String msg = br.readLine();
			if(msg==null) {
				break;
			}
			
			System.out.println(msg);
			
		}
		
		br.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
