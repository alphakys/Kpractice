package baekjun;
import java.io.*;

public class If_2753 {

	public static void main(String[] args) throws IOException{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		int A = Integer.parseInt(bf.readLine());
		
		
		if(((A%4==0)&& (A%100!=0)) || (A%400==0)) {
			System.out.println(1);
		}

		else {
			System.out.println(0);
		}
		
		bf.close();
	}

}
