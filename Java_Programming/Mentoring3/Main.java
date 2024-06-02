package Mentoring3;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("<책 등록>");
		LibraryBook lb = new LibraryBook("자바", "종호", 2023, 10);
		ReferenceBook rb = new ReferenceBook("자바참고도서", "임종호", 2001, 20, 5);
		
		System.out.println("<현재 도서관에 있는 책>");
		lb.getInfo();
		System.out.println();
		rb.getInfo();
		System.out.println();
		
		System.out.println("-----------------------------------------");
		System.out.println("<책 대출>");
		lb.borrow();
		lb.borrow();
		rb.borrow();
		
		System.out.println("-----------------------------------------");
		System.out.println("<현재 도서관에 있는 책>");
		lb.getInfo();
		System.out.println();
		rb.getInfo();
		System.out.println();
		
		System.out.println("-----------------------------------------");
		System.out.println("<책 반납>");
		lb.returnBook();
		lb.returnBook();
		rb.returnBook();
		
		System.out.println("-----------------------------------------");
		System.out.println("<현재 도서관에 있는 책>");
		lb.getInfo();
		System.out.println();
		rb.getInfo();
		System.out.println();
		
	}
}
