package Class1;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력 : ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + "-" + b + "의 결과는 " + (a-b) + "입니다");
	}

}
