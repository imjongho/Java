package Exception;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		s = s.toUpperCase();		// 대문자로 변환
		System.out.println(s);		
		String[] words = s.split(" ");	// 띄어쓰기로 구분

		int[] cnt = new int[26];
		for(int i = 0; i < 26; i++) {
			cnt[i] = 0;	// 초기화
		}
		
		
		for(String w : words) {
			System.out.println(w);
		
			try {
				int i = w.charAt(0) - 'A';	// 아스키 코드로 변환
				cnt[i]++;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException : Input includes non-alphabet.");
			}
		}
		
		
		for(int i = 0; i < 26; i++) {
			char c = (char)(i+'A');
			System.out.println("Character " + c + ": " + cnt[i]);
		}
		
		
		sc.close();
	}

}
