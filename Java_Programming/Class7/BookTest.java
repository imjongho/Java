package Class7;
import java.util.Scanner;
import java.util.ArrayList;

class Book {
	
	private String title;
	private int score;
	static int cnt = 0;	// 정적 필드
	
	// 생성자
	public Book(String title, int score) {
		this.title = title;
		this.score = score;
		cnt++;
	}
	
	public String getTitle() {
		return title;
	}
	
	
	public String toString() {
		return "Book [title =" + title + ", score = " + score + "]";
	}
	

}




public class BookTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Book> list = new ArrayList<Book>();
		
		String title;
		int score;
		int flag = 0;
		
		while(true) {
			System.out.println("===============================");
			System.out.println("1. 책 등록");
			System.out.println("2. 책 검색");
			System.out.println("3. 모든 책 출력");
			System.out.println("4. 종료");
			System.out.println("===============================");
			
			System.out.print("메뉴를 선택하시오 : ");
			flag = sc.nextInt();
			
			if(flag == 1) {
				System.out.print("책 제목 : ");
				title = sc.next();
				System.out.print("책 평점 : ");
				score = sc.nextInt();
				list.add(new Book(title, score));
			}
			else if(flag == 2) {
				System.out.print("책 제목 : ");
				title = sc.next();
				for(Book e : list) {
					if(e.getTitle().equals(title)) {
						System.out.println(e);
					}
				}
			}
			else if(flag == 3) {
				for(Book e : list) {
					System.out.println(e);
				}
			}
			else if(flag == 4) {
				System.out.println("종료합니다");
				break;
			}
			else {
				System.out.println("잘못 입력");
			}
			
		}
		
		
		sc.close();

	}

}
