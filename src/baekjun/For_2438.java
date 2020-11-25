package baekjun;
import java.io.*;
import java.util.StringTokenizer;

public class For_2438 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		

		for(int i=1;i<=N;i++) {
				for(int j=0; j<(N-i);j++) {
										System.out.print(" ");
											}
				
				for(int k=1; k<(i+1);k++) {
								System.out.print("*");
										}
				
									System.out.println();
				
								}
		
		
		bf.close();
		
		
	}

}
