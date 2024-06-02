package Class5;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] day = {"월", "화", "수", "목", "금", "토", "일"};
		int user = 0;
		
		while(true) {
			System.out.print("정수를 입력하세요>>");
			user = sc.nextInt();
	
			if(user < 0) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}
			
			int index = (user - 1) % day.length;
			System.out.println(day[index]);
			
		}
		
	}

}
