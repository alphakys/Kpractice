package baekjun;
import java.io.*;

public class If_14681 {

	public static void main(String[] args) throws IOException{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = bf.readLine().split(" ");
		
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		
		
		
		// B>=45 |||| B<45
		
		int minusM = 60-(45-B);
		
		
		if(B>=45) {
				
					System.out.println(A+" "+(B-45));
				}
				
		else {
				if(A==0) {
					System.out.println(23+" "+minusM);
				}
				else {
					System.out.println((A-1)+" "+minusM);
				}
					
				}
				

	
		bf.close();
	}

}
