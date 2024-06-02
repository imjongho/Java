package Class4;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 숫자 개수 : ");
		int num = sc.nextInt();
		
		int first = 0, second = 1, temp = 0;
		
		System.out.print(first + " " + second + " ");
		temp = first + second;
		
		for(int i = 0; i < num - 2; i++) {
			System.out.print(temp + " ");
			first = second;
			second = temp;
			temp = first + second;
		}
	}

}
