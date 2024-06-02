package Class3;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("M : ");
		int M = sc.nextInt();
		
		int R = 0;
		for(int i = 1; i <= M; i++) {
			R = R + (i * i + 1);
		}
		System.out.println("R = " + R);
		
	}

}
