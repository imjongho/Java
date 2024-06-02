package Class13_2;
import java.util.Scanner;

public class WordGuessGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] words = {"java", "count", "school", "book", "student", "programmer"};

		int index = (int)(Math.random()*6);	// 0~5
		int len = words[index].length();	// 랜덤하게 얻은 문자열의 길이
		char[] now = new char[len];		// 현재 상태 배열
		char[] answer = new char[len];	// 정답 배열
		
		for(int i = 0; i < len; i++) {
			now[i] = '_';
			answer[i] = words[index].charAt(i);
		}
		
		// 참고용
		for(int i = 0; i < len; i++) {
			System.out.print(answer[i]);
		}
		System.out.println();
		
		for(int i = 0; i < len; i++) {
			System.out.print(now[i]);
		}
		System.out.println();
		//
		
		int cnt = 0;
		while(true) {
			
			System.out.print("현재의 상태: ");
			for(int i = 0; i < len; i++) {
				System.out.print(now[i]);
			}
			System.out.println();
			
			if(cnt == len) {
				break;
			}
			
			System.out.print("글자를 추측하시오: ");
			char c = sc.next().charAt(0);
			
			for(int i = 0; i < len; i++) {
				if(c == answer[i]) {
					now[i] = c;
					cnt++;
				}
			}
			
		}
		
		
		sc.close();
	}


}
