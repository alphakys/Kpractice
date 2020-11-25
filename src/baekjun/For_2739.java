package baekjun;
import java.io.*;

public class For_2739 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		for(int i=1;i<=9;i++) {
						System.out.println(N+" * "+i+" = "+i*N);
							}
		
		
		bf.close();
		
		
	}

}
