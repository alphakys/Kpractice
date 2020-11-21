package baekjun;

import java.util.*;

public class Function_1065 {
	
		
		int num1;
		

						  

		int Hnum100(int N) {
			
			if(N<=99) {
				return N;
				 	  }
		
			else {
			
			
			
			int count=0;
			
			for(int i=100; i<=N; i++) {
					
					int minus1 = (((i%100)/10)- (i/100));
					int minus2 =  (((i%100)%10) - ((i%100)/10));	
					
					
									  
							if(minus1==minus2) {
											count++;
											   }
									 
								
								 		}
										return 99+count;
			
						
				  }
							}
	

					
			
		
		
			
			public static void main(String[] args) {
				
			
			Scanner sc = new Scanner(System.in);
			
				
			
		
			
			Function_1065 f = new Function_1065();
			
			
			int N =sc.nextInt();
			
			System.out.println(f.Hnum100(N));
			
			
			
			sc.close();
			
			}
			
			
			
			
			}
		
		




		