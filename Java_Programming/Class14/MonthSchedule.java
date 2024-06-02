package Class14;
import java.util.Scanner;

public class MonthSchedule {
	
	private Scanner sc;
	private Day days[];
	
	public MonthSchedule(int num) {
		sc = new Scanner(System.in);
		
		days = new Day[num];
		for(int i = 0; i < num; i++) {
			days[i] = new Day();	// 객체 30개 생성
		}
		
		start();
		sc.close();
	}
	
	public void start() {
		System.out.println("이번달 스케쥴 관리 프로그램.");
	
		while(true) {
			System.out.print("할일(입력: 1, 보기: 2, 끝내기: 3) >> ");
			int flag = sc.nextInt();
			
			if(flag == 1) {
				System.out.print("날짜(1~30)? ");
				int day = sc.nextInt();
				if(day >= 1 && day <= 30) {
					System.out.print("할일? ");
					String work = sc.next();
					days[day-1].set(work);
				}
				else {
					System.out.println("입력 오류");
				}
			}
			else if(flag == 2) {
				System.out.print("날짜(1~30)? ");
				int day = sc.nextInt();
				if(day >= 1 && day <= 30) {
					System.out.print(day + "일의 할 일은 ");
					days[day-1].show();
				}
				else {
					System.out.println("입력 오류");
				}
			}
			else if(flag == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("입력 오류");
			}
			
			System.out.println();
		}	
	}
	
	
}
