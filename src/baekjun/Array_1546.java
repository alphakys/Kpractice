package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_1546 {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		double[] scoreArr = new double[N];
		
		
			String[] str = br.readLine().split(" ");
			
			for(int i=0;i<N;i++) {
				scoreArr[i] = Double.parseDouble(str[i]);
			
								}
			
			
			double max = scoreArr[0];
			
			for(int i=0;i<scoreArr.length;i++) {
				
				if(max<scoreArr[i]) {
					max = scoreArr[i];
				
				}
				
			}
			
		double[] realScore = new double[N];
		
		for(int i=0; i<realScore.length;i++) {
			
			realScore[i] = (scoreArr[i]/max)*100;
		}
			
			
		double avg;
		double sum = 0;
		for(int i=0; i<realScore.length;i++) {
			
			sum+=realScore[i];
			
		}
			
		System.out.println(sum/(double)N);
		
		
		
		
		
		
		/*
			for(int i : scoreArr) {
			System.out.println(i);
			}
		*/


	}

}
