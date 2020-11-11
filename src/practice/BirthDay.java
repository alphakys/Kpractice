package practice;

class BirthDay {

	int day;
	int month;
	int year;
	
	public void setYear(int year) {
	this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
	public BirthDay(int pday) {
		day = pday;
	}
	
	public static void main(String[] args) {
		
		BirthDay bday = new BirthDay(25);
			
		
		
		System.out.println(bday.day);
		bday.printThis();
	}


	}


