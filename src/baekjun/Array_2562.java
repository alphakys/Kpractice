package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_2562 {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] nArr = new int[9];
		
		for(int i=0;i<9;i++) {
			String str = br.readLine();
			nArr[i]=Integer.parseInt(str);
		}
		
		
		int max = nArr[0];
		
		for(int i=0;i<9;i++) {
			
			if(max<nArr[i]) {
				max = nArr[i];
			}
			
		}System.out.println(max);
		
		for(int i=0;i<9;i++) {
			
			if(nArr[i]==max) {
				System.out.println(i+1);
			}
		
		}
		
		
		br.close();
		
		
		
	}

}
