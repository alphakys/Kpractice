package practice;

import java.util.Scanner;

public class Max1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[3];
		int[] num1 = new int[5];
		int[] num2 = new int[4];
		int[] num3 = new int[10];
		
		int max = 0;
		
		for(int i = 0; i< num.length; i++) {
			System.out.println((i+1)+"번째 값을 입력하시오");
			
			num[i] = sc.nextInt();
			
			if(i==0) {
				max = num[i];
			} else {
				max = max< num[i] ? num[i] : max;
				
			}
			System.out.println("Max :"+max);
			
			
		}
		
		
		
		
		
		String[] str = new String[10];
		
		
		
		
		
		
		
		
	}

}
