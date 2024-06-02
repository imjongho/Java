package Class13;
import java.util.Scanner;

public class StringTest2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		int len = str.length();
		
		for(int i = 0; i < len; i++) {
			// substring() --> 부분 문자열 반환(시작, 끝)
			String first = str.substring(0,1);	// 맨 앞 문자
			String last = str.substring(1);		// 맨 앞 문자를 제외한 나머지 문자
			str = last + first;
			System.out.println(str);
		}
		
		sc.close();
	}

}
