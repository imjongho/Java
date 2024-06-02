package Mentoring3;

public class Book {
	
	private String title;	// 제목
	private String author;	// 작가
	private int publicationYear;	// 출판년도
	
	// 생성자, 매개변수 3개를 받고 해당 값들 초기화
	public Book(String title, String author, int publicationYear) {
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}
	
	// 책의 정보를 출력하는 메소드
	public void getInfo() {
		System.out.print("제목: " + title + ", 작가: " + author + ", 출판년도: " + publicationYear);
	}
	
	public String getTitle() {
		return title;
	}
	
}
