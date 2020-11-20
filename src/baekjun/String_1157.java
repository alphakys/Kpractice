package baekjun;
import java.io.*;
import java.util.*;


public class String_1157 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String str = bf.readLine();
	
		
	
		int countI = 0;
		int count = 0;
		for(int i=0;i<str.length();i++)
					{
						for(int j =0;j< str.length();j++) 
									{
								if((int)str.charAt(i)==(int)str.charAt(j))
										{
									countI++;
										
										}
								
								
									}
			//////////////////////////////////////////////////////////////////////////					
						      count= countI;
						
						      countI=0;
						System.out.println(i+","+count+","+countI);
								
						
					}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
