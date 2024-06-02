package Project1;
import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sub_count = 0;
		System.out.println("이름을 입력하세요.");
		String name = sc.next();
		System.out.println("국어점수를 입력해주세요.");
		int korean = sc.nextInt();
		sub_count++;
		System.out.println("수학점수를 입력하세요.");
		int math = sc.nextInt();
		sub_count++;
		System.out.println("영어점수를 입력하세요.");
		int english = sc.nextInt();
		sub_count++;
		int sum = korean + math + english;
		System.out.println(name + "의" + sub_count + "과목 합계는" + sum + "입니다.");
	}
}
