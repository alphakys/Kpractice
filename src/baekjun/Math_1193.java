package baekjun;

import java.io.*;
import java.util.Stack;


public class Math_1193 {

	public static void main(String[] args)throws IOException {
			
		
		Stack<Integer> st = new Stack<>();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));			
			
		//st.push();
		st.pop();
		st.peek();
		
		
		
		while(true) {	
			
			
			String str[] = bf.readLine().split(" ");
			
			int n = Integer.parseInt(str[1]);
			
			
			if(str[0].equals("push")) {
								st.push(n);
									}
			
			if(str[0].equals("pop")) {
								st.pop();
								System.out.println(st.pop());
									}
			
			
			
			
			
		}
			
			
			
			
	}

}
