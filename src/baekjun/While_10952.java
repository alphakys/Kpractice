package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class While_10952 {

	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean run = true;
		while(run) {
			
			String strArr[] = br.readLine().split(" ");
			
			int A = Integer.parseInt(strArr[0]);
			int B = Integer.parseInt(strArr[1]);
			
			if(A==0 && B==0) {
				run = false;
				break;
			}
				
			bw.write(String.valueOf(A+B));
			bw.newLine();
			bw.flush();
			
			
			
			
		}
		
		
		
		br.close();
		bw.close();
		
		
		
		
	}
}
