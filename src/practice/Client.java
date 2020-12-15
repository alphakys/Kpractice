package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args)throws IOException {
		
		// IP Address = 192.168.100.15
		//PORT = 10001
		
		Socket s = new Socket();
		System.out.println("server connecting~~");
		s.connect(new InetSocketAddress("192.168.0.19",10002));
		
		
		//입.출력 스트림
		
		OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream(),"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		InputStreamReader isr = new InputStreamReader(s.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		
		Scanner sc = new Scanner(System.in);
		String msg;
		
		
		while(true) {
			msg = sc.nextLine();
			
			if("/q".equals(msg)) {
				break;
			}
			
				bw.write(msg);
				bw.newLine();
				bw.flush();
				
				String serverMsg = br.readLine();
				System.out.println("Client1: "+serverMsg);
			
		}
		
		sc.close();
		bw.close();
		
		s.close();
		br.close();
		System.out.println("클라이언트가 대화 종료");
		s.close();
		
	}

}
