package baekjun;
import java.util.*;

 public class Function_4673 {
	 
	 

	  int dn(int a) {
		 
		 int selfNum = a + (a/10) + (a%10);
		  
		 return selfNum; 
	  }
	 
	 
	 
	  
	  public static void main(String[] args) {			
		
				
				
				Function_4673 dn = new Function_4673();
	
				for(int i=1; i<=100;i++) {
						int answer = dn.dn(i);
							
							for(int j=1; j<=answer;j++) {
									if(answer==j) {
											System.out.println(j);
												  }
													}
										
											}	
				
											
				
		  
		  
		  

 }
	
 }
