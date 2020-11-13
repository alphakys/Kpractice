package baekjun;

import java.util.Scanner;

public class While10951 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		//sum = (N%10)*10+((N/10) + ((N%10)%10));
		
			// ((N%10)*10) + ((N/10)+(N%10)) = sum
			
		int N = sc.nextInt();	
		
		int count = 0;
		int sum=N;
		
		
		while(true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			count++;
			
			if(sum==N) {
				break;
			}
		}
		
			System.out.println(count);
	
	

}}
