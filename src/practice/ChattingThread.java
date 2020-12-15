package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ChattingThread extends Thread {
	
	Socket s;
	
	
	ChattingThread(){}
	
	ChattingThread(Socket s){
		this.s = s;
	}
	
	
	
	
	@Override
	public void run() {
		
		try {
		InputStream is = s.getInputStream();
		InputStreamReader isr = new InputStreamReader(is,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream os = s.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		while(true) {
			
			
			String msg = br.readLine();
			
			if(msg==null) {
				break;
			}
			
				System.out.println("받은메세지: "+msg);
			
				bw.write(msg);
				bw.newLine();
				bw.flush();
			
			
		}
		
		br.close();
		bw.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
