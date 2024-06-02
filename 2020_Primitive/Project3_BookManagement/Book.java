package Project3_BookManagement;

public class Book {
	
	private String title;		// 제목 
	private String writer;		// 저자
	private int price;			// 가격
	
	public Book(String title, String writer, int price) {	// 생성자 및 프로그램 실행
		this.title = title;
		this.writer = writer;
		this.price = price;
	}
	
	public void show() {	// 출력
		System.out.println("--------------------------");
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + writer);
		System.out.println("가격 : " + price);
		System.out.println("--------------------------");
	}
	
	
	// ---------------- 접근자, 설정자-----------------
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
