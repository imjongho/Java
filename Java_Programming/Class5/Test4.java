package Class5;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		System.out.println("양수 5개를 입력하세요.");
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		int max = num[0];
		for(int x : num) {
			if(x > max) {
				max = x;
			}
		}
		System.out.println("가장 큰 수는 " + max + " 입니다.");

	}

}
