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
	
	
	
	public static void main(String[] args) {
		
		BirthDay bday = new BirthDay();
		bday.setYear(1989);
		
		
		System.out.println(bday);
		bday.printThis();
	}


	}


