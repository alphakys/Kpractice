package baekjun;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class For_15552 {

	public static void main(String[] args) throws IOException {
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			
			int T = Integer.parseInt(br.readLine());
			
			for(int i=0; i<T; i++) {
					
				String strArr[] = br.readLine().split(" ");
				
				int A = Integer.parseInt((strArr[0]));
				int B = Integer.parseInt((strArr[1]));
				
				bw.write(String.valueOf(A+B));
				
				bw.newLine();
				
			}

			bw.flush();
			bw.close();
			br.close();
			
	}
}