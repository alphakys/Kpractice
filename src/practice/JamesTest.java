package practice;

public class JamesTest {

	void printGreeting(String name) {
	 	System.out.println(name+"님 안녕하세요");
	
	 	
	 	
	 	
	}
	
	public static void main(String[] args) {
		
		JamesTest J = new JamesTest();
		
		FunctionTest V = new FunctionTest();
		
		double div2 = V.div(10, 5);
		System.out.println(div2);
		
			J.printGreeting("강용수");
		
	}

}
