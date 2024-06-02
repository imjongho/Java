package Midterm_Exam;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s[][] = { {"JVM", "자바를 실행하기 위한 가상 기계"},
				{"Syntax Error", "순서 오류"},
				{"Runtime Error", "실행시간 오류"},
				{"Logic Error", "논리 오류"},
				{"상속", "물려받음"},
				{"캡슐화", "보호"},
				{"추상화", "공통적인 속성을 미리 설계"},
				{"다형성", "다른 타입의 객체 생성"},
				{"Public", "전부 접근 가능"},
				{"Protrcted", "동일한 패키지 내에 존재하거나 파생 클래스에서만 접근 가능"},
				{"Private", "자기 자신의 클래스 내에서만 접근 가능 나머지는 접근 불가"}};
		
		
		boolean[] check = new boolean[11];	// 설명이 11개
		
		while(true) {
			System.out.print("입력 (문제 갯수: 0~11 / 종료: -1) : ");
			int cnt = sc.nextInt();
			for(int i = 0; i < 11; i++) {	// 초기화
				check[i] = false;
			}
			
			if(cnt >= 0 && cnt <= 11) {
				for(int i = 0; i < cnt; i++) {	// 문제 개수만큼 출력
					int index = (int)(Math.random() * 11);	// 0~10 행 index
					
					while(true) {	// 중복 제거
						if(check[index] == true) {
							index = (int)(Math.random() * 11);
						}
						else {	// false
							check[index] = true;
							break;
						}
					}
					
					System.out.print(s[index][0] + "  ");
					System.out.println(s[index][1]);
				}
				System.out.println();
			}
			else if(cnt == -1) {
				System.out.println("프로그램 종료");
			}
			else {
				System.out.println("잘못 입력하였습니다.");
			}

			
			if(cnt == -1) {
				break;
			}
		}
		
		
		sc.close();
	}

}
