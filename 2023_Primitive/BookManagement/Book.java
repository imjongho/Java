package BookManagement;

public class Book {
	private String title;
	private String author;
	private int price;
	
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// 클래스의 정보를 출력하는 show함수를 오버라이딩으로 재정의해서 사용
	public void show() {
		System.out.println("책 제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("가격 : " + price);
	}
	
	
	
	
	// get, set 사용
	public String getTitle() {
		// 책 제목 반환할 때 공백 없애기
		return title.replaceAll(" ", "");
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		// 저자명을 반환할 때 공백 없애기
		return author.replaceAll(" ", "");
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
