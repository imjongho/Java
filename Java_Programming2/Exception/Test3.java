package Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		int result = 0;
		
		for(int i = 0; i < 3; i++) {
			
			try {
				System.out.print(i + ">>");
				int num = sc.nextInt();	// 예외 발생
				arr[i] = num;
			}
			catch(InputMismatchException e) {
				System.out.println("Not a integer. Please try again.");
				sc.next();
				i--;
				continue;
			}
		}
		
		// 결과 출력
		for(int i = 0; i < 3; i++) {
			result += arr[i];
		}
		System.out.println("Result: " + result);
		
		sc.close();
	}

}
