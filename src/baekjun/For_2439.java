package baekjun;
import java.io.*;
import java.util.StringTokenizer;

public class For_2439 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		

		for(int i=1;i<=N;i++) {
				for(int j=1; j<=i;j++) {
							System.out.print("*");
								}
			
					System.out.println();
				
							}
		
		
		bf.close();
		
		
	}

}
