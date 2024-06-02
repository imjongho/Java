package Class5;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l;	// 배열의 크기
		double sum = 0;	
		int[] num = new int[5];		// 5개의 정수 입력
		
		System.out.println("배열의 크기를 입력하세요.");
		l = sc.nextInt();

		System.out.println("5개의 정수를 입력하세요.");
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		System.out.printf("평균은 %.2f 입니다.", sum/l);
		
	}

}
