package baekjun;
import java.io.*;
public class Math_1839 {

	public static void main(String[] args) throws IOException {
						
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		int answer = (N/5) + ((N%5)/3);
		
		if(N%5==0 || N%3==0) {
			System.out.println(answer);
		}
		else if((N%5)%3==0) {
			System.out.println(answer);
		}
		else {
			System.out.println(-1);
		}
		
		
		
		
		bf.close();
		
		
		
	}

}
