package baekjun;
import java.io.*;


public class Basic_2588 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		int A = Integer.parseInt(bf.readLine());
	
		int B = Integer.parseInt(bf.readLine());
	
		int one = (B%100)%10;
		int ten = (B%100)/10;
		int hund = (B/100); 
		
		
		System.out.println(A*one);
		
		System.out.println(A*ten);
		System.out.println(A*hund);
		System.out.println(A*B);
		
		bf.close();
	}

}
