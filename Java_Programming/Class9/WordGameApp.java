package Class9;
import java.util.Scanner;

// 각 선수를 나타내는 Player 클래스
/*
class Player {
	
	private String name;
	private String word;
	
	public Player() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getWord() {
		return word;
	}
	
	public void setWord(String word) {
		this.word = word;
	}
}

// main을 포함하는 WordGameApp 클래스
public class WordGameApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		String word = "java";
		
		System.out.println("끝말잇기 게임을 시작합니다...");
		System.out.print("게임에 참가할 인원은 몇명입니까>>");
		int member_num = sc.nextInt();
		
		Player[] p = new Player[member_num];	// 멤버만큼 객체 생성
		for(int i = 0; i < member_num; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			p[i] = new Player();	// 멤버만큼 객체 생성 실체화
			name = sc.next();		// 이름 입력 받음
			p[i].setName(name);
		}
		
		System.out.println("시작하는 단어는 java입니다");
		while(true) {
			for(int i = 0; i < member_num; i++) {
				
				int lastIndex = word.length()-1; 		//마지막 문자에 대한 인덱스
	            char lastChar = word.charAt(lastIndex); //마지막 문자
				
	            // 단어 입력 받음
				System.out.print(p[i].getName() + ">>");
				word = sc.next();
				p[i].setWord(word);
				
				// 현재 입력받은 첫번째 단어와 전 사람의 마지막 문자가 다르면 강제 종료
				if(word.charAt(0) != lastChar) {
					System.out.println(p[i].getName() + "이 졌습니다.");
					System.exit(0);
				}
			}
			
		}


	}

}
*/
