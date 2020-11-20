package baekjun;

import java.util.Scanner;

public class String_10809 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
			
		//((char)97);
		
		String S = sc.nextLine();
		
		
	
		
		
		for(int i=0;i<26;i++) {
							
						int indexOf = S.indexOf((char)(97+i));
				System.out.print(indexOf+" ");
							   }
		
		
		/*
		int length = S.length();
		System.out.println(length);
		
		char[] chArr = new char[length];
		
		
		for(int i=0;i<chArr.length;i++) {
					
					chArr[i] = S.charAt(i);
									
		
										}
		
		
		
		
		for(char k : chArr) {
		System.out.println(k);
							}
		
		*/
		
		
		

	

	}

}
