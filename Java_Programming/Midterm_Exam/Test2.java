package Midterm_Exam;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String arr[] = { "Draw", "Player Win", "Computer Win" };
		int user_num[] = new int[100]; 
		int com_num[] = new int[100];
		
		System.out.print("Enter the number of Rock Paper Scissers : ");
		int cnt = sc.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			System.out.print("Rock(0), Paper(1), Scissors(2) : ");
			user_num[i] = sc.nextInt();
			com_num[i] = (int)(Math.random() * 3);	// 0~2	
		}
		
		
		System.out.println("Match     Computer  Player    Result");
		for(int i = 0; i < cnt; i++) {
			System.out.printf("%-10d%-10d%-10d", i + 1, com_num[i], user_num[i]);

			if(user_num[i] == com_num[i]) {
				System.out.println(arr[0]);
			}
			else if(user_num[i] == (com_num[i] + 1) % 3) {
				// 0은 1한테 지고, 1은 2한테, 2는 0한테 짐
				System.out.println(arr[1]);
			}
			else {
				System.out.println(arr[2]);
			}
		}
		
		
		
		
		sc.close();
	}



}
