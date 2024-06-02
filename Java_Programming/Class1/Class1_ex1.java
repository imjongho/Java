package Class1;
// import java.util.Scanner;	// 라이브러리 클래스 포함
import java.util.*;

public class Class1_ex1 {

	public static void main(String[] args) {
		
		// 키보드의 입력을 위해 Scanner 객체 생성(new)
		Scanner stdIn = new Scanner(System.in);
		System.out.print("이름과 나이, 몸무게를 공간(space)으로 구분하여 입력 : ");
		
		String name = stdIn.next();		// 키보드로부터 이름을 문자열로 입력
		int i = stdIn.nextInt();		// 나이를 정수로 입력
		double d = stdIn.nextDouble();	// 몸무게를 실수로 입력
		
		System.out.println(name + "의 나이는 " + i + "이고");	
		System.out.println("몸무게는 " + d + "Kg입니다");
	}

}
