package Class4;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0 <= x < n 사이의 값을 뽑습니다.");
		System.out.print("n 값을 입력하세요 : ");
		int n = sc.nextInt();
		int user, com;
		int cnt = 1;
		com = (int)(Math.random() * n);		// 0~n	
		
		
		while(true) {
			System.out.print("정답을 추측하여 보세요 : ");
			user = sc.nextInt();
			
			if(user == com) {
				System.out.println("축하합니다. 정답 : " + com + ", 시도횟수 : " + cnt);	
				break;
			}
			else if(user < com) {
				System.out.println("제시한 정수가 정답보다 낮습니다.");	
			}
			else if(user > com) {
				System.out.println("제시한 정수가 정답보다 높습니다.");
			}
			
			cnt++;
		}
		
		
	}

}
