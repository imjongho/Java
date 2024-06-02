package Class2;
import java.util.Scanner;

public class Class2_Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money;
		
		System.out.print("금액을 입력하세요 : ");
		money = sc.nextInt();
		
		System.out.println("일만원권 : " + (money / 10000) + "장");
		System.out.println("천원권 : " + (money % 10000 / 1000) + "장");
		System.out.println("오백원 : " + (money % 1000 / 500) + "개");
		System.out.println("백원 : " + (money % 500 / 100) + "개");
		System.out.println("십원 : " + (money % 100 / 10) + "개");
		System.out.println("일원 : " + (money % 10 / 1) + "개");
	
	}

}
