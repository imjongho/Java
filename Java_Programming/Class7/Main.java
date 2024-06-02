package Class7;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("PIN을 입력 : ");
		int pin = sc.nextInt();
		Account jongho = new Account();		// 생성자 호출, jongho라는 객체 생성
		jongho.setPin(1234);	// 핀번호 1234로 설정
		
		if(jongho.getPin() == pin) {	// 설정한 핀번호와 입력한 핀 번호가 같으면 실행
			
			System.out.println();
			int num = 0;	// 번호
			int money = 0;	// 돈
			
			while(true) {
				
				System.out.println("1. 현금 입금");
				System.out.println("2. 현금 인출");
				System.out.println("3. 잔액 확인");
				System.out.println("4. 종료");
				
				System.out.print("번호를 선택 : ");
				num = sc.nextInt();		// 번호 선택
				
				if(num == 1) {
					System.out.print("입금액 : ");
					money = sc.nextInt();
					jongho.input_money(money);
				}
				else if(num == 2) {
					System.out.print("인출액 : ");
					money = sc.nextInt();
					jongho.output_money(money);
				}
				else if(num == 3) {
					jongho.show_balance();
				}
				else if(num == 4) {
					System.out.println("종료합니다.");
					break;
				}
				else {
					System.out.println("다시 입력하세요.");
				}
				
				System.out.println();
			} // while문 끝
			
			
		}
		else {
			System.out.println("PIN이 잘못되었습니다.");
		}
		
		
		sc.close();
	}

}
