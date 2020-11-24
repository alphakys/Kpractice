package baekjun;
import java.io.*;
public class Math_1839 {

	public static void main(String[] args) throws IOException {
						
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		// 3i +5j > N --- -1출력
		
		// 3i +5j == N --- i+j 출력
		
		//i와 j는 0부터 시작
		
		//sum +=6*i(0<=i)
		int j;
		int sum =1;
		for(int i=0;i<=N;i++) {
				sum+=6*i; //1
				System.out.print(sum+",");
				for(j=1; j<=N;j++) {
					sum+=6*j;
					System.out.println(sum);
					
				}System.out.println(i+","+j);
			
			
		
		}
		
		
	}

}
