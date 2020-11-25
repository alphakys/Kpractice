package baekjun;
import java.io.*;
import java.util.StringTokenizer;

public class For_10871 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = bf.readLine().split(" ");
		
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		
		String[] strN = bf.readLine().split(" ");
		
		
	
		for(int i=0;i<a;i++) {
			
					if(Integer.parseInt(strN[i])< b) {
						System.out.println(Integer.parseInt(strN[i]));
												}
			
				
		}
		
		bf.close();
		
		
	}

}
