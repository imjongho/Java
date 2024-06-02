package Mentoring3;

// 도서관 책, Book클래스를 상속받음
public class LibraryBook extends Book {
	
	private int bookId;		// 책 식별자
	public boolean isBorrowed;	// 대출 여부
	
	// 생성자, 매개변수 4개 받고 해당 값 초기화
	public LibraryBook(String title, String author, int publicationYear, int bookId) {
		super(title, author, publicationYear);
		this.bookId = bookId;
		isBorrowed = false;
	}

	@Override
	public void getInfo() {
		super.getInfo();
		System.out.print(", 식별자: " + bookId + ", 대출여부: " + isBorrowed);
	}
	
	// 책을 대출하는 메소드
	public void borrow() {
		if(isBorrowed == true) {
			System.out.println("이미 대출 중인 책입니다.");
		}
		else {
			System.out.println("책 " + getTitle() + "을(를) 대출했습니다.");
			isBorrowed = true;
		}
	}
	
	// 책을 반납하는 메소드
	public void returnBook() {
		if(isBorrowed == false) {
			System.out.println("이미 반납된 책입니다.");
		}
		else {
			System.out.println("책 " + getTitle() + "을 반납했습니다.");
			isBorrowed = false;
		}
	}
	
}















