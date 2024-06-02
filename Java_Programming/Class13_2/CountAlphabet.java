package Class13_2;
import java.util.Scanner;

public class CountAlphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		System.out.println("영문 텍스트를 입력하고 세미클론을 입력하세요.");
		while(true) {
			String line = sc.nextLine();
			if(line.length() == 1 && line.charAt(0) == ';') {
				break;
			}
			sb.append(line);
		}
		
		String s = sb.toString();
		s = s.toUpperCase();		// 대문자로
		s = s.replace(" ", "");		// 공백 제거
		System.out.println(s);
		

		int result[] = new int[26];	// 알파벳 횟수 저장할 배열(A~Z까지 26개)
		for(int i = 0; i < 26; i++) {
			result[i] = 0;	// 0으로 초기화
		}
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);;
			
			if(c >= 'A' && c <= 'Z') {
				int index = c - 'A';
				result[index]++;
			}
		}
		
		
		// 출력
		System.out.println("히스토그램을 그립니다.");
		for(int i = 0; i < 26; i++) {
			System.out.print((char)('A'+i));
			for(int j = 0; j < result[i]; j++) {
				System.out.print('-');
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
