package Final_Exam;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		System.out.println("Input Text");
		while(true) {
			String line = sc.nextLine();
			if(line.length() == 1 && line.charAt(0) == ';') {
				break;
			}
			sb.append(line);
		}
		
		String s = sb.toString();
		String[] words = s.split(" ");
		int cnt = 0;
		for(int i = 0; i < words.length; i++) {
			cnt++;
		}
		System.out.println("Number of Words: " + cnt);
		
		s = s.toUpperCase();		// 대소문자 구분 없앰
		//System.out.println(s);
		
		int result[] = new int[26];	// 알파벳 횟수 저장할 배열(A~Z까지 26개)
		for(int i = 0; i < 26; i++) {
			result[i] = 0;	// 0으로 초기화
		}
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c >= 'A' && c <= 'Z') {
				int index = c - 'A';
				result[index]++;
			}
		}
		
		
		// 출력
		// Intelligent Networking and Security Laboratory at Kongju National Univerity
		System.out.println("Alphabet: ");
		for(int i = 0; i < 26; i++) {
			if(result[i] != 0) {	// 없는 알파벳 출력 X
				System.out.print((char)('A' + i));
				System.out.println(" " + result[i]);
			}
		}
		
		sc.close();
	}
	
}
