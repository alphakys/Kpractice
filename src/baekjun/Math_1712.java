package baekjun;
import java.io.*;
public class Math_1712 {

	public static void main(String[] args) throws IOException {
					
		
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] brEvenNum = bf.readLine().split(" ");
		
		int aC = Integer.parseInt(brEvenNum[0]);
		int bC = Integer.parseInt(brEvenNum[1]);
		int price = Integer.parseInt(brEvenNum[2]);
		
		System.out.println(aC+1);
		System.out.println(bC+1);
		System.out.println(price+1);
		

		
		
		bf.close();
		

		
	}

}
