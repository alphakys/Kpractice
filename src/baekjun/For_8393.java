package baekjun;
import java.io.*;
import java.util.StringTokenizer;

public class For_8393 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		int sum = 0;
		
		for(int i=1;i<=N;i++) {
			
			sum+=i;
		
							}
		System.out.println(sum);
		
		bf.close();
		
		
	}

}
