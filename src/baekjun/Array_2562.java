package baekjun;

import java.util.Scanner;

public class Array_2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int i;
		
		int[] numG = new int[9];
		
		for(i=0;i<numG.length;i++)
					{
				numG[i]	= sc.nextInt();
					}
		
			int max = numG[0];
			
			
		
			
			
		for(i=0;i<numG.length;i++)
						{
						if(max<numG[i]) {
										max= numG[i];
								
										}
						
						
						
						
						}System.out.println(max);
		
						
		for(i=0; i<numG.length;i++) {
							
							if(max==numG[i]) {
								System.out.println(i+1);
										  }
									}				 
				
				
		
						sc.close();
		
		
	}

}
