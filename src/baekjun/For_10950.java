package baekjun;
import java.io.*;
import java.util.StringTokenizer;

public class For_10950 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		

		for(int i=1;i<=N;i++) {
			
			String str = bf.readLine();
			StringTokenizer st = new StringTokenizer(str," ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
				
				System.out.println(a+b);
							}
		
		
		bf.close();
		
		
	}

}
