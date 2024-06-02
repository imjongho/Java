package Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Random number is generated. Guess the number:");
		System.out.println("0~99");
		
		int randomNum = (int)(Math.random()*100);
		int userNum = 0;
		int cnt = 1;
		
		while(true) {
			
			System.out.print(cnt + ">>");
			try {
				userNum = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Only integer is allowed.");
				sc.next();	// 스캐너 문제 처리
				continue;
			}
			
			if(userNum < randomNum) {
				System.out.println("Enter a larger number.");
			} else if(userNum > randomNum){
				System.out.println("Enter a smaller number.");
			}else {
				System.out.println("Correct.");
				System.out.println("Try again? (y/n)>>");
				String ch = sc.next();
				if(ch.equals("y")) {
					System.out.println("\nRandom number is generated. Guess the number:");
					System.out.println("0~99");
					randomNum = (int)(Math.random()*100);
					cnt = 1;
					continue;
				} else {
					System.out.println("Game End");
					break;
				}
			}
			
			cnt++;	// 횟수 증가
		}
		
		
		sc.close();
	}

}
