package baekjun;

import java.util.Scanner;

public class Array_1546 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		
		
			int i;
			
			
			int N = sc.nextInt();
			
			double[] numG = new double[N];
			
			double max = numG[0];
			
			
			for(i =0;i<numG.length;i++) 
							{
						numG[i] = sc.nextInt();
							}
		
			
			for(i=0;i<numG.length;i++) 
							{
						if(max<numG[i])
									{
								max = numG[i];
									}
							}
			
			double[] score = new double[N];
			
			for(i=0;i<numG.length;i++) 
						{
						score[i]= ((numG[i]/max))*100;	
						}
			
			double sum = 0;
			
			
			for(i=0;i<score.length;i++)
								{
							 sum +=score[i];	
								}
			   
			System.out.println(sum/N);
			
			
			
			sc.close();
			
			
		
		
		
		
		
	}

}
