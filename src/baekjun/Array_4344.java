package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_4344 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int C = Integer.parseInt(br.readLine());
		
		// int N = Integer.parseInt(br.readLine());
		
		
		String[] str;
		int[] score=null;
		
		for(int i=0;i<C;i++) {
			str = br.readLine().split(" ");
			score = new int[str.length];
			score[i] = Integer.parseInt(str[i]);
		}
		
		
		
		int sum=0;
		for(int i=1;i<score.length;i++) {
			sum+=score[i];
			
		}
		
		double avg = (double)sum / (double)score[0];
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
