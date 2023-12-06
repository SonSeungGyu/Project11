package object;

public class Ex4 {
	public static void main(String[] args) {
		Book book = new Book(123,"도서");
		System.out.println(book.toString());
		//클래스에서 toString을 재정의하면 자동으로 참조변수만 선언해도 toString을 이용한것과 동일한 효과를 볼 수 있음
		System.out.println(book); // book.toString과 같음
	}

}

class Book {
	int bookNumber;
	String bookTitle;

	public Book(int bookNumber, String bookTitle) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	//generate-toString 메뉴를 이용
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
	}
	
	

}
