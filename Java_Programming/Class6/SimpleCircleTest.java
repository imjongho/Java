package Class6;
import java.util.Scanner;

class SimpleCircle {
	static final double PI = 3.14159;
}

public class SimpleCircleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하세요 : ");
		double r = sc.nextDouble();
		System.out.println("원의 반지름은 : " + r);
		System.out.println("원의 넓이는 : " + r * r * SimpleCircle.PI);
		
		sc.close();
	}

}
