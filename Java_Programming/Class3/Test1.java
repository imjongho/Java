package Class3;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int user_num, com_num;
		
		System.out.print("가위(0), 바위(1), 보(2) : ");
		user_num = sc.nextInt();
		com_num = (int)(Math.random() * 3);
		
		if(user_num == com_num) {
			System.out.println("컴퓨터와 비겼음");
		}
		else if(user_num == (com_num + 1) % 3) {
			// 0은 1한테 지고, 1은 2한테, 2는 0한테 짐
			System.out.println("사람 : " + user_num + ", 컴퓨터 : " + com_num + " > 사람 승리");
		}
		else {
			System.out.println("사람 : " + user_num + ", 컴퓨터 : " + com_num + " > 컴퓨터 승리");
		}
		
	}

}
