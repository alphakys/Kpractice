package javabook.practice;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args)throws IOException {
		
		// IP Address = 192.168.100.15
		//PORT = 10001
		
		//순서도 서버와 클라이언트 사이의 통신(네트워크)은 각 개체가 서로 네트워크를 할 수 있는 주소가 있어야 가능하다.
		
		//따라서 서버의 IP주소와 그 교신을 받아줄 항구(포트)가 필요하다.
		
		/*
		 * 1. 서버소켓 생성
		 * 2. 서버소켓과 네트워크 주소와 포트를 결합(bind)
		 * 3. 서버소켓을 일반소켓에 대입 후 클라이언트의 소켓이 연결 신청시 받아준다(accept)
		*/
		
		ServerSocket ss = new ServerSocket();
		System.out.println("서버 start");
		ss.bind(new InetSocketAddress("192.168.100.15",10002));
		
		Socket s = ss.accept();
		
		System.out.println("server connected");
		
		ChattingThread ct = new ChattingThread();
		
		// 입.출력 스트림
		/*
		OutputStream os = s.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		InputStream is = s.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		*/
		
		Thread t = new Thread(new ChattingThread());
		
		
		t.start();
		
		
		System.out.println("서버 종료");
		
		
	}	

}
