package baekjun;

import java.util.Scanner;

public class While10951 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			int sum;
			
			int N = sc.nextInt();
			
			// N%10-- 일의 자리,,,,, N/10 --- 십의 자리
			sum = (N/10) + (N%10);	
			
			
			int sum1 = (N%10)*10+(sum%10) ;
					
					
					
			System.out.println(sum);
			System.out.println(sum1);
			
		
			
		}
	}


