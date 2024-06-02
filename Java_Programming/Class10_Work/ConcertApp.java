package Class10_Work;
import java.util.Scanner;

//콘서트 관련 기능 관리
class Concert {
	
	Scanner sc = new Scanner(System.in);
	Seat seat = new Seat();
	
	
	// 생성자
	Concert() {
		System.out.println("명품콘서트홀 예약 시스템입니다.");
	}
	
	
	// 좌석 타입 , 예약자 이름, 좌석 번호를 순서대로 입력 받아 예약하는 메소드
	public void book() {
		
		System.out.print("좌석구분 S(1), A(2), B(3)>> ");
		int seatType = sc.nextInt();
		
		if(seatType >= 1 && seatType <= 3) {
			seat.showSeat(seatType);
			
			System.out.print("이름>> ");
			String name = sc.next();
			System.out.print("번호>> ");
			int number = sc.nextInt();
			
			if(number >= 1 && number <= 10) {
				seat.inputSeat(name, number, seatType);
			}
			else {
				System.out.println("번호 잘못 입력");
			}
		}
		else {
			System.out.println("좌석 잘못 입력");
		}

	}
	
	
	// 모든 좌석을 출력하는 조회 메소드
	public void check() {
		seat.showAll();
	}
	
	
	// 취소는 예약자의 이름을 입력받아 취소
	public void cancel() {
		
		System.out.print("좌석구분 S(1), A(2), B(3)>> ");
		int seatType = sc.nextInt();
		
		if(seatType >= 1 && seatType <= 3) {
			seat.showSeat(seatType);
			
			System.out.print("이름>> ");
			String name = sc.next();
			
			seat.cancelSeat(name, seatType);
		}
		else {
			System.out.println("좌석 잘못 입력");
		}
	}
	
}




// Concert 객체 생성 및 프로그램 시작
public class ConcertApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Concert concert = new Concert();
		
		while(true) {
			// 메뉴 : 예약/조회/취소/끝내기
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>> ");
			int flag = sc.nextInt();
			
			if(flag == 1) {
				concert.book();		// 예약 메소드 호출
			}
			else if(flag == 2) {
				concert.check();	// 조회 메소드 호출
			}
			else if(flag == 3) {
				concert.cancel();	// 취소 메소드 호출
			}
			else if(flag == 4) {
				System.out.println("종료합니다.");
				break;
			}
			else {
				System.out.println("입력 오류(1~4)");
			}
		}
		
		sc.close();
		
	}

}
