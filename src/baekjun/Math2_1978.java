package baekjun;

import java.util.Scanner;

public class Math2_1978 {

	public static void main(String[] args) {
					
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] K = new int[N];
		
		
		
		for(int i=0;i<K.length;i++) {
			K[i] = sc.nextInt();
			
		}
		
		int count=0;
		int countA=0;
		
		
		for(int j=2;j<=K[0];j++ ) {
			
			if(K[0]%j==0) {
						count++;
							if(count>2) {
								break;
								
							 }
							else {
								countA++;
							 }
						  }
			
			
			
			
								 }
		
		
		
		
		
		
		
	}

}
