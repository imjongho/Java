package Class11;

// 저자
class Author {
	private String name;
	private int age;
	private String nation;
	
	Author(String name, int age, String nation) {
		this.name = name;
		this.age = age;
		this.nation = nation;
	}
	
	public String toString() {
		return "\nauthor= Author[name=" + name + ", age=" + age + ", nation=" + nation + "]";
	}
}

// 발행자
class Publisher {
	private String name;
	private String nation;
	
	Publisher(String name, String nation) {
		this.name = name;
		this.nation = nation;
	}
	
	public String toString() {
		return "\npublisher= Publisher[name=" + name + ", nation=" + nation + "]";
	}
}

// 책 정보
class Book {
	private String title;
	private int page;
	private Author author;
	private Publisher publisher;
	
	Book(String title, int page, Author author, Publisher publisher) {
		this.title = title;
		this.page = page;
		this.author = author;
		this.publisher = publisher;
	}
	
	public String toString() {
		return "Book[title=" + title + ", page=" + page + author + publisher + "\n]";
	}
}


public class BookTest {
	public static void main(String[] args) {
		Author a = new Author("임종호", 23, "한국");
		Publisher p = new Publisher("문화동네", "미국");
		Book book = new Book("자바프로그래밍", 205, a, p);
		System.out.println(book);
	}
	
}











