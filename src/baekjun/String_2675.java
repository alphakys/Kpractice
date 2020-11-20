package baekjun;
import java.io.*;
import java.util.*;


public class String_2675 {

	public static void main(String[] args) throws IOException {

		
			 
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int T = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < T; i++) {
		
				String[] str = br.readLine().split(" ");	// 공백 분리
				
				int R = Integer.parseInt(str[0]);	// String -> int
				String S = str[1];
				
				for(int j = 0; j < S.length(); j++) {
					for(int k = 0; k < R; k++) {
						System.out.print(S.charAt(j));
					}
				}
				System.out.println();
			}
		
	 
	 
	
	/*	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		int N = Integer.parseInt(bf.readLine());
		
		
		for(int i=0;i<N;i++) {
			
					String[] str = bf.readLine().split(" ");
					
					int Rotation = Integer.parseInt(str[0]);
						    
					for(int j = 0; j<str[1].length();j++)
								{
							for(int k=0; j<Rotation; k++) 
									{
								System.out.print(str[1].charAt(j));
									}
								
								}
							System.out.println();
								
		
							}
	
		bf.close();
		*/
	}

}
