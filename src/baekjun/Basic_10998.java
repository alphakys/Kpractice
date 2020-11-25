package baekjun;
import java.io.*;


public class Basic_10998 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = bf.readLine().split(" ");
		
		int A = Integer.parseInt(str[0]);
	
		int B = Integer.parseInt(str[1]);
		
		int C = Integer.parseInt(str[2]);
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
		
		bf.close();
	}

}
