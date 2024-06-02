package swingExample3;
import java.util.*;

public class TokenTest2 {
	public static void main(String[] args) {
		String s = "대한민국 서울시+마포구+공덕동 185번지)";
		StringTokenizer st = new StringTokenizer(s, "+| ");		// |로 여러개 구분자로 나눌 수 있음
		
		int tokenCnt = 0;
		while(st.hasMoreTokens()) {
			tokenCnt++;
			String word = st.nextToken();
			System.out.println(word);
		}
		System.out.println("총 토큰의 갯수는 " + tokenCnt + "개입니다");
	}

}
