package IO_Example;
import java.io.*;
import java.util.Vector;
import java.util.Scanner;

public class Test5_WordSearch {

	private Vector<String> wordVector = new Vector<String>(); 
	
	public Test5_WordSearch() {		// 생성자
		
	}
	
	private boolean readFile() {	// words.txt 파일 읽기
		try {
			Scanner fScanner = new Scanner(new FileInputStream("words.txt"));
			while(fScanner.hasNext()) {
				wordVector.add(fScanner.nextLine());	// 한 라인에 하나의 단어
			}
			fScanner.close();
		}catch(FileNotFoundException e) {
			System.out.println("No words.txt");
			return false;
		}
		
		System.out.println("words.txt has been found");
		return true;
	}
	
	private void processQuery() {	// 단어 검색
		Scanner scanner = new Scanner(System.in);
		while(true) {
			boolean found = false;
			System.out.print("Words>>");
			String searchWord = scanner.nextLine();		// 검색할 단어 입력
			if(searchWord.equals("Exit")) {
				break;	// 검색 종료
			}
			
			// Vector에서 검색 
			for(int i = 0; i < wordVector.size(); i++) {
				String word = wordVector.get(i);	// 벡터 내의 문자열
				if(word.length() < searchWord.length()) {	// 벡터의 문자열이 검색 문자열보다 짧은 경우
					continue;
				}
				
				// 벡터 문자열의 아푸분을 검색 문자열 크기만큼 잘라내기
				String frontPart = word.substring(0, searchWord.length());
				
				if(searchWord.equals(frontPart)) {	// 검색 문자열과 잘라낸 앞 부분 비교
					System.out.println(word); 	// 벡터에서 발견한 단어 출력
					found = true;
				}
			}
			
			if(!found) {	// 한 단어도 발견 못한 상태
				System.out.println("Not found");
			}
		}
		scanner.close();
	}
	
	
	public void run() {
		boolean res = readFile();	// res가 false이면 단어 파일 읽기 실패
		if(res == true) {
			processQuery();
		}
		System.out.println("Bye!");
	}
	
	
	public static void main(String[] args) {
		Test5_WordSearch ws = new Test5_WordSearch();
		ws.run();
	}

}
