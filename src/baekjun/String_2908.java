package baekjun;

import java.io.*;


public class String_2908 {

	public static void main(String[] args) throws IOException{
	

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = bf.readLine().split(" ");
		
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		
		
		int Snum = (A/100) +(((A%100)/10)*10) + (((A%100)%10)*100);
		
		int Snum1 = (B/100) +(((B%100)/10)*10) + (((B%100)%10)*100);
		
		
		if(Snum>Snum) {
					System.out.println(Snum);
						}
		
		else {
			System.out.println(Snum1);
		}
		
		
		bf.close();
		
		
		
	}

}
