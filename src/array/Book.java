package array;

public class Book {

	private String book;
	private String author;
	
	
	
		public Book() {}
		
		public Book(String book, String author) {
			this.book = book;
			this.author = author;
		}

		
		public String getBook() {
			return book;
		}
		
		
		public void setBook(String book) {
			this.book = book;
		}
		
		public String getauthor() {
			return author;
		}
		
		public void setauthor(String author) {
			this.author = author;
		}
		
		public void showBookInfo() {
			System.out.println(book+","+author);
		}
		
		
		
		
		
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		
		
		
		
	}

}
