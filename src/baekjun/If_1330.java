package baekjun;
import java.io.*;

public class If_1330 {

	public static void main(String[] args) throws IOException{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = bf.readLine().split(" ");
		
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		
		if(A>B) {
			System.out.println(">");
		}
		else if(A<B) {
			System.out.println("<");
		}
		else {
			System.out.println("==");
		}
		
	}

}
