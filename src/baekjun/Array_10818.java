package baekjun;

import java.util.Scanner;

public class Array_10818 {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		int i;
		
		int N = sc.nextInt();
		
		int[] numGroup = new int[N];
		
		for(i=0;i<numGroup.length;i++)
							{
					numGroup[i] = sc.nextInt();
		
							}
		
			int max = numGroup[0];
			int min = numGroup[0];
		
		
		for(i=0;i<numGroup.length;i++)
						{
						if(max<numGroup[i]) 
									{
								max = numGroup[i];	
									}
					
						} 
		
		for(i = 0;i<numGroup.length;i++)
						{
							if(min>numGroup[i]) 
										{
									min = numGroup[i];	
										}
						
							} 
						
		System.out.println(max+" "+min);
		
		
			sc.close();
		
		/*
		for(int j:numGroup) {
			System.out.println(j);
		}
		/*
		int[] array = {4,87,3,34,66,88,4312,33};
		
		int max = array[0];
		int min = array[0];
		
		
		
		for(int i=0;i<array.length;i++)
					{
					if(max<array[i]) 
									{
									 max=array[i];	
									 
									}
					}System.out.println(max);
		
		
					
		for(int i=0; i<array.length;i++) 
						{
						if(min>array[i]) {
							min=array[i];
								 }	
						
						}System.out.println(min);
		
		
		*/
		
		
		
		
		
		
		
		
	}

}
