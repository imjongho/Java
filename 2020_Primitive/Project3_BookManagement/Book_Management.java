package Project3_BookManagement;

import java.util.*;

public class Book_Management {
	
	private Book b;
	private Ebook eb;
	private Magazine m;
	
	Scanner sc = new Scanner(System.in);
	
	public Book_Management() {
		System.out.println("=======================도서관리 프로그램=======================");
		input();
		find();
	}
	
	public void input() {
		
		System.out.println("<도서 입력>");
		
		for(int i = 0; i < 3; i++) {
			
			if(i == 0) {
				System.out.println("책(제목, 저자, 가격)");
			}
			else if(i == 1) {
				System.out.println("전자책(제목, 저자, 가격, 보안키)");
			}
			else {
				System.out.println("잡지(제목, 저자, 가격, 발행일)");
			}
			
			System.out.print("제목 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 : ");
			String writer = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			if(i == 0) {
				b = new Book(title, writer, price);
			}
			else if(i == 1) {
				System.out.print("보안키 : ");
				String security_key = sc.nextLine();
				eb = new Ebook(title, writer, price, security_key);
			}
			else {
				System.out.print("발행일 : ");
				String date_issue = sc.nextLine();
				m = new Magazine(title, writer, price, date_issue);
			}
		}
	}
	
	public void find() {
		
		System.out.println("\n<도서 검색>");
		
		while(true) {
			
			System.out.println("1.도서명  2.저자명  3.입력종료");
			int selec = sc.nextInt();
			sc.nextLine();
			
			if(selec == 1) {
				
				System.out.print("도서명 : ");
				String book_name = sc.nextLine();
				
				book_name = remove_space(book_name);
				String book_title = remove_space(b.getTitle());
				String ebook_title = remove_space(eb.getTitle());
				String magazine_title = remove_space(m.getTitle());
				
				if(book_name.compareTo(book_title) == 0) {
					b.show();
				}
				else if(book_name.compareTo(ebook_title) == 0) {
					eb.show();
				}
				else if(book_name.compareTo(magazine_title) == 0) {
					m.show();
				}
				else {
					System.out.println("책이 존재하지 않습니다.");
				}
				
			}
			else if(selec == 2) {
					
				System.out.print("저자명 : ");
				String writer_name = sc.nextLine();
				
				writer_name = remove_space(writer_name);
				String book_writer = remove_space(b.getWriter());
				String ebook_writer = remove_space(eb.getWriter());
				String magazine_writer = remove_space(m.getWriter());
				
				if(writer_name.compareTo(book_writer) == 0) {
					b.show();
				}
				else if(writer_name.compareTo(ebook_writer) == 0) {
					eb.show();
				}
				else if(writer_name.compareTo(magazine_writer) == 0) {
					m.show();
				}
				else {
					System.out.println("책이 존재하지 않습니다.");
				}
				
			}
			else if(selec == 3) {
				System.out.println("입력 종료\n");
				break;
			}
			else {
				System.out.println("잘못 입력");
			}
		}
	}
	
	String remove_space(String str) {
		str = str.replaceAll(" ", "");
		return str;
	}
	
}
