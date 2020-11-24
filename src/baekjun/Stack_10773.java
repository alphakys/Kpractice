package baekjun;
import java.io.*;
import java.util.*;


public class Stack_10773 {

	public static void main(String[] args)throws IOException, java.util.EmptyStackException {
											
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack <Integer> st = new Stack<>();
		
		
		int K = Integer.parseInt(bf.readLine());
		int i;
		int count=0;
		
		for(i=0; i<K;i++) {
			int N = Integer.parseInt(bf.readLine());
			
			if(N!=0) {
					st.push(N);
					}
			else if(N==0 && !st.isEmpty()){
			
				st.pop();
				count++;
		
				}
				
		//		
			
								}
		
			int sum = 0;
		
		for(int j=0;j<K-count;j++) {
					
				sum+=st.pop();
				
						}System.out.println(sum);
				
		
		
		
		
		
		
		
		
		
	}

}
