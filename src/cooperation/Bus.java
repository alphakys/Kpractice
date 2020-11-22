package cooperation;



public class Bus {
		
	
	int busNumber;
	int passengerCount;
	int money;
		
	
	
	
	
	
	//버스 번호를 매개변수로 받는 생성자
	
	public Bus(int busNumber){
		this.busNumber = busNumber;
	}
	
	
	
	
	
	
	
	//승객이 버스에 탄 경우를 구현한 메서드
	
	
	public void take(int money){
		this.money+=money;
		this.passengerCount+=1;
		//passengerCount++;
	}
	
	
	
	
	
	
	
	
	
	
	// 버스 정보를 출력하는 메서드
		
	public void busInfo() {
		System.out.println("이 버스는 "+busNumber+"이고 이 버스의 승객은"+passengerCount+"명 입니다 그리고 수입은 "+money);
	}
	
	
	
	
	
	
	
	
	
	
	


	

	
	
	
	
	
}


