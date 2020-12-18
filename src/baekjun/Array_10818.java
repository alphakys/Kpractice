package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_10818 {

	public static void main(String[] args)throws IOException {
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		
		String[] strArr = str.split(" ");
		
		int[] numArr = new int[N];
		
		for(int i=0;i<N;i++) {
			
			numArr[i]= Integer.parseInt(strArr[i]);
		}
		
		
		int max = numArr[0];
		int min = numArr[0];
		
		
		for(int j=0;j<N;j++) {
			
		if(min>numArr[j]) {
				min=numArr[j];
			}
			
		}
		System.out.print(min+" ");
		
		
		for(int j=0;j<N;j++) {
			
			if(max<numArr[j]) {
				max=numArr[j];
			}
			
		}
		System.out.print(max);
		
		
		
		
		
		
	
		
		br.close();
		
	}

}
