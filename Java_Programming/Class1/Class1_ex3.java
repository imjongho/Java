package Class1;
import java.util.Scanner;

public class Class1_ex3 {

	public static void main(String[] args) {
		// 실행 시간 오류 예제
		// 0으로 나누거나, 배열의 첨자가 벗어났거나, 사용자의 입력값이 잘못 입력
		
		/*
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();	// 사용자의 입력 값이 잘못되었을 때
		int b = stdIn.nextInt();	// 예) kin 3
		System.out.println("입력받은 두 수의 합 : " + (a+b));
		*/
		
		int i = 3;
		int j = 5/0;
		System.out.println(i+j);
		
	}

}
