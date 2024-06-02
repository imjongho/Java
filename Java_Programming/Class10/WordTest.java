package Class10;
import java.util.Scanner;
import java.util.ArrayList;

class Word {
	
	private String eng = "";	// 초기에 미리 설정함
	private String kor = "";
	
	// 두 종류 생성자 사용(오버로딩) 매개변수 개수가 다름
	public Word(String eng) {
		this.eng = eng;
	}
	
	public Word(String eng, String kor) {
		this.eng = eng;
		this.kor = kor;
	}
	
	public String getEng() {
		return eng;
	}
	
	public String getKor() {
		return kor;
	}
	
	// 설명이 없을 경우 설명이 필요하다는 문구 출력
	public String toString() {
		if(eng.equals("")) {
			eng = "설명 필요";
		}
		
		if(kor.equals("")) {
			kor = "설명 필요";
		}
		
		return eng + "->" + kor;
	}
	
}

public class WordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Word> list = new ArrayList<Word>();

		list.add(new Word("Java", "자바"));
		list.add(new Word("Artificial Intelligence", "인공지능"));
		list.add(new Word("Reinforcement Learning", "강화학습"));
		list.add(new Word("Supervised Learning", "지도학습"));
		list.add(new Word("Unsupervised Learning", "비지도학습"));
		list.add(new Word("Internet of Things"));
		list.add(new Word("Network"));
		

		while(true) {
			
			System.out.println("검색할 단어를 입력하시오(종료 quit)");
			String word = sc.nextLine();	
			// next(공백), nextLine(Enter)의 차이
			
			if(word.equals("quit")) {
				System.out.println("종료합니다.");
				break;
			}
			
			for(Word w : list) {
				if(w.getEng().equals(word)) {
					System.out.println(w);
				}
			}
			
		}
		
		sc.close();
	}

}
