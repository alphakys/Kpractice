package cooperation;

public class Student {
	
	public String name;
	public int grade;
	public int money;
	
	
	
	//학생 이름과 가진 돈을 매개변수로 받는 생성자
	
	public Student(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	
	
	
	
	
	
	
	// 학생이 버스를 타면 1000원을 지불하는 기능을 구현하는 메서드


	public void takeBus(Bus bus){
		this.money-=1000;
		bus.take(1000);
	}
	
	
	
	
	
	
	
	
	
	
	
	// 학생이 지하철을 타면 1500원을 지불하는 메서드
	
	public void takeSubway(Subway sub){
		this.money-=1500;
		sub.take(1500);
	}
	
	
	
	
	
	//학생의 현재 정보를 출력하는 메서드
	
	
	public void getStudentInfo() {
		System.out.println(name+"학생의 현재 남은 돈은"+ money+"입니다.");
	}
	
	
	
}
