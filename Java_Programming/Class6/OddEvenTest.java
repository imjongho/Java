package Class6;
import java.util.Scanner;

// 여기다가 class Odd나 class OddEven을 쓸 수 있다.(함수 느낌)

public class OddEvenTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		OddEven obj = new OddEven();
		
		System.out.println("짝수의 합 : " + obj.even_sum(num));
		System.out.println("홀수의 합 : " + obj.odd_sum(num));
		
		sc.close();
	}

}
