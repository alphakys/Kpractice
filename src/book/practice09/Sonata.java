package book.practice09;

public class Sonata  extends Car{

	@Override
	public void start() {
		System.out.println("Sonata가 시동을 켭니다.");
		
	}

	@Override
	public void dirve() {
		System.out.println("Sonata가 달립니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("Sonata가 멈춥니다.");
		
	}

	@Override
	public void turnoff() {
		System.out.println("Sonata가 시동을 끕니다.");
		
	}
	
	
	
	
	
}
