package BookManagement;
import java.util.Scanner;
import java.util.ArrayList;


public class BookManagement {
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Book> bookList = new ArrayList<Book>();
	ArrayList<Ebook> ebookList = new ArrayList<Ebook>();
	ArrayList<Magazine> magazineList = new ArrayList<Magazine>();
	
	// 전역변수 사용
	private String title;
	private String author;
	private int price;
	
	
	// 기본 생성자
	BookManagement(){
		System.out.println("=============도서관리 프로그램==============");
		input();
		find();
	}
	
	
	public void inputBasicInfo() {
		System.out.print("제목 : ");
		title = sc.nextLine();
		
		System.out.print("저자 : ");
		author = sc.nextLine();
		
		System.out.print("가격 : ");
		price = sc.nextInt();
	}
	
	
	public void input() {
		System.out.println("\n<도서 입력>");
		
		while(true) {
			System.out.println("--------------------------------");
			System.out.println("1.책, 2.전자책, 3.잡지, 4.입력종료");
			int flag = sc.nextInt();
			sc.nextLine();	// 개행문자 제거
			
			if(flag == 1) {
				System.out.println("책(제목, 저자, 가격)");
				inputBasicInfo();
				bookList.add(new Book(title, author, price));
			}
			else if(flag == 2) {
				System.out.println("책(제목, 저자, 가격, 보안키)");
				inputBasicInfo();
				
				System.out.print("보안키 : ");
				String key = sc.next();
				ebookList.add(new Ebook(title, author, price, key));
			}
			else if(flag == 3) {
				System.out.println("책(제목, 저자, 가격, 발행일)");
				inputBasicInfo();
				
				System.out.print("발행일 : ");
				String date = sc.next();
				magazineList.add(new Magazine(title, author, price, date));
			}
			else if(flag == 4) {
				System.out.println("도서 등록을 종료합니다.");
				break;
			}
			else {
				System.out.println("입력 오류(1~4)");
			}
		}
		
	}
	
	
	public void findInfo() {
		String str = sc.nextLine();
		str = removeSpace(str);
		
		for(Book b : bookList) {
			if(b.getTitle().equals(str) || b.getAuthor().equals(str)) {
				b.show();
			}
		}
		
		for(Ebook eb : ebookList) {
			if(eb.getTitle().equals(str) || eb.getAuthor().equals(str)) {
				eb.show();
			}
		}
		
		for(Magazine m : magazineList) {
			if(m.getTitle().equals(str) || m.getAuthor().equals(str)) {
				m.show();
			}
		}
	}
	
	
	public void findPriceRange() {
		int findPrice = sc.nextInt();
		
		// 오차범위는 임의로 +-5000원으로 설정함
		// 책 가격 20000 - 내가 찾는 책 값 15000 = 5000(오차범위)
		for(Book b : bookList) {
			if(b.getPrice() - findPrice <= 5000 && b.getPrice() - findPrice >= -5000) {
				b.show();
				System.out.println();
			}
		}
		
		for(Ebook eb : ebookList) {
			if(eb.getPrice() - findPrice <= 5000 && eb.getPrice() - findPrice >= -5000) {
				eb.show();
				System.out.println();
			}
		}
		
		for(Magazine m : magazineList) {
			if(m.getPrice() - findPrice <= 5000 && m.getPrice() - findPrice >= -5000) {
				m.show();
				System.out.println();
			}
		}
	}
	
	
	public void find() {
		System.out.println("\n<도서 검색>");
		
		while(true) {
			System.out.println("--------------------------------");
			System.out.println("키워드 검색");
			System.out.println("1.도서명, 2.저자명, 3.가격검색, 4.종료");
			int flag = sc.nextInt();
			sc.nextLine();	// 개행문자 제거
			
			if(flag == 1) {
				System.out.print("도서명 : ");
				findInfo();
			}
			else if(flag == 2) {
				System.out.print("저자명 : ");
				findInfo();
			}
			else if(flag == 3) {
				System.out.print("가격검색 : ");
				findPriceRange();
			}
			else if(flag == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("입력 오류(1~4)");
			}
		}
		
	}
	
	
	public String removeSpace(String str) {
		String strR = str.replaceAll(" ", "");
		return strR;	
	}
	
	
	
}
	
