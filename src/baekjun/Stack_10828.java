package baekjun;


import java.io.IOException;

import java.util.Stack;

import java.io.*;

public class Stack_10828 {
		
		public static void main(String[] args)throws IOException {
			
			
			Stack<Integer> st = new Stack<>();
			
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
			//st.push();
		
			int N = Integer.parseInt(bf.readLine());
			
			for(int i=0;i<N;i++) {	
				
				
				String str[] = bf.readLine().split(" ");
				
				int n = Integer.parseInt(str[1]);
				
				if(str[0].equals("push")) {
									st.push(1);
										}
										
				else if(str[0].equals("pop")) {
									if(st.size()==0) {
												bw.write(-1);
													}
									else {
										bw.write(st.peek());	
										st.pop();
										}
										}
				else if(str[0].equals("size")) {
										bw.write(st.size());
										}
	
				else if(str[0].equals("top")) {
										bw.write(st.peek());
										}
			
						
		
									}
		
		
		
			}
}

