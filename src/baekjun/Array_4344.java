package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Array_4344 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int C = Integer.parseInt(br.readLine());
		
		// int N = Integer.parseInt(br.readLine());
		
		
		String[] str;
		ArrayList<Double> score = new ArrayList<>();
		
		
		
		for(int i=0;i<C;i++) {
			 
			int sum=0;
		
			int cnt = 0;
		
			
			str = br.readLine().split(" ");
		

			for(int b=0; b<str.length;b++) {
				
				 score.add(Double.parseDouble(str[b]));
			}
		
			
			for(int j=1;j<score.size();j++) {
									sum+=score.get(j);
											}
			
			
			
			double avg = (double)sum / score.get(0);
			
			
			
			
			for(int k=0; k<score.size();k++){
			
			if(score.get(k)>avg) {
							cnt++;
								}
			
		
											}
		
		
		double answer =((double)cnt/ score.get(0))*100.00;
		double answer1 =((double)cnt/ score.get(0));
		System.out.println(answer);
		System.out.println(answer*1000);
		System.out.println(Math.round(answer*1000)+"%");
			
		score.clear();
		
		}
		
		
		
		
		
	}

}
