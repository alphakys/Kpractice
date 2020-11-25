package baekjun;
import java.io.*;

import java.util.StringTokenizer;

public class For_15552 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
			
		int T = Integer.parseInt(bf.readLine());
		
		for(int i=0; i<T; i++) {
			
						String str = bf.readLine();
			StringTokenizer st = new StringTokenizer(str," ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
		
			
					System.out.println(a+b);
					
			
							}
		
		bf.close();
	}

}
