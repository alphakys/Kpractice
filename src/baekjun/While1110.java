package baekjun;

import java.util.Scanner;

public class While1110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
				if(A>0 && B<10) {
					System.out.println(A+B);
				} else {
					break;
				}
			
		}
		
		
		
	}

}
