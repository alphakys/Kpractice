package baekjun;
import java.io.*;


public class Basic_1000 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = bf.readLine().split(" ");
		
		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);

		
		System.out.println(K+N);
		
		bf.close();
		
		
		
		
	}

}
