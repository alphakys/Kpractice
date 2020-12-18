package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Array_2577 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[3];
		for(int i=0;i<3;i++) {
			
			try{
				String str = br.readLine();
				int N = Integer.parseInt(str);
				arr[i] = N;
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
		int result = arr[0]*arr[1]*arr[2];
		
		String strResult = Integer.toString(result);
		
		String[] strArr = strResult.split("");
		int[] numArr = new int[strArr.length];
		
		for(int i=0; i<strArr.length;i++) {
			
			numArr[i] = Integer.parseInt(strArr[i]);
			
		}
		

		for(int j=0; j<10; j++) {
				int cnt = 0;
				for(int i=0;i<numArr.length;i++) {
					if(numArr[i]==j) {
						cnt++;
					}
					
				}System.out.println(cnt);
			
		}
			
			
			
		}
		
		
		
		
		
		
	}


