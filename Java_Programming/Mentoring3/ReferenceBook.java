package Mentoring3;

// 참고 도서, LibraryBook 클래스를 상속 받음
public class ReferenceBook extends LibraryBook {
	
	private int edition;	// 개정 n판
	
	// 매개변수 5개 받아서 해당 값들 초기화
	public ReferenceBook(String title, String author, int publicationYear, int bookId, int edition) {
		super(title, author, publicationYear, bookId);
		this.edition = edition;
		// isBorrowed는 LibraryBook 클래스의 생성자에서 false로 초기화 됨 
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.print(", 판: " + edition);
	}
	
	// borrow() 메소드를 오버라이딩하기
	@Override
	public void borrow() {
		System.out.println("참고 도서는 대출할 수 없습니다.");
	}
}
