package Project2_Reservation;

import java.util.*;

public class Reservation {
	Scanner sc = new Scanner(System.in);
	
	public char[][] seat = new char[4][5];
	
	public Reservation() {
		set_seat();   // 자리 설정 함수 호출(초기화)
		menu();
	}
	
	// 자리 설정 함수
	private void set_seat() {
		
		int i = 0, j = 0;
		char row_seat_name = 'A';	// 행 이름
		char col_seat_name = '1'; 	// 열 이름
				
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 5; j++) {
				if(i == 0 && j == 0) {
					seat[0][0] = ' ';
				}
				else if(i == 0) {
					seat[0][j] = col_seat_name++;
				}
				else if(j == 0) {
					seat[i][0] = row_seat_name++;
				}
				else {
					seat[i][j] = '□';
				}
			}
		}
	}
	
	public void menu() {
		
		int exit = 0;
		System.out.println("<자리 예매 프로그램>");
		
		do {
			System.out.println("\n1.예매 2.취소 3.종료");
			System.out.print("=> ");
			
			int value = sc.nextInt();
			
			switch(value) {
			case 1:
				book();
				break;
			case 2:
				cancel();
				break;
			case 3:
				System.out.println("프로그램 종료");
				exit = value;
				break;
			default:
				System.out.println("다시 입력");
				break;
			}
			
		} while(exit != 3);
	}
	
	private void book() {
		
		System.out.println("예약할 자리를 선택해주세요.");
		System.out.println("(A~C)(1~4) ex.A3");
		System.out.print("=> ");
		
		String seat_choice = sc.next();
		
		char[] arr = new char[2];
		
		for(int i = 0; i < 2; i++) {
			arr[i] = (seat_choice.charAt(i));
		}
		
		if(arr[0] < 'A' || arr[0] > 'C' || arr[1] < '1' || arr[1] > '4') {
			System.out.println("잘못 입력했습니다.");
		}
		else if(seat[(int)(arr[0] - 'A') + 1][(int)(arr[1] - '1') + 1] == '■') {
			System.out.println("이미 예약된 자리입니다.");
		}
		else {
			seat[(int)(arr[0] - 'A') + 1][(int)(arr[1] - '1') + 1] = '■';
			System.out.println("예약이 완료되었습니다.");
			print_seat();
		}

	}
	
	private void cancel() {
		
		System.out.println("취소할 자리를 선택해주세요.");
		System.out.println("(A~C)(1~4) ex.A3");
		System.out.print("=> ");
		
		String seat_choice = sc.next();
		
		char[] arr = new char[2];
		
		for(int i = 0; i < 2; i++) {
			arr[i] = (seat_choice.charAt(i));
		}
		
		if(arr[0] < 'A' || arr[0] > 'C' || arr[1] < '1' || arr[1] > '4') {
			System.out.println("잘못 입력했습니다.");
		}
		else if(seat[(int)(arr[0] - 'A') + 1][(int)(arr[1] - '1') + 1] == '□') {
			System.out.println("비어있는 자리입니다.");
		}
		else {
			seat[(int)(arr[0] - 'A') + 1][(int)(arr[1] - '1') + 1] = '□';
			System.out.println("취소가 완료되었습니다.");
			print_seat();
		}
	}
	
	public void print_seat() {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(seat[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
