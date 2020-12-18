package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Array_3052 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numArr = new int[10];
		
		for(int i =0;i<10;i++) {
			
			numArr[i]=i;
		}
		
		ArrayList<Integer> remainArr = new ArrayList<>();
		
		for(int i =0;i<10;i++) {
			
			remainArr.add(i);
		}
		
		ArrayList<Integer> remainArr1 = new ArrayList<>();
		
		for(int i =10;i<20;i++) {
			
			remainArr1.add(i);
		}
		

		remainArr.addAll(remainArr1);
	
		
		
		
		
		
		
			
			if(remainArr.contains(Integer.parseInt(br.readLine()))) {
				
			}
			else {
				remainArr.add(Integer.parseInt(br.readLine()));
				System.out.println(remainArr.get(21));
			}
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		HashSet<Integer> hSet = new HashSet<>();
		
	
		
		for(int i =0;i<10;i++) {
		
			hSet.add(numArr[i]%42);
			
		}
		
		System.out.println(hSet.size());
	    */
	}

}
