package swingExample3;
import java.util.*;

public class TokenTest1 {
	public static void main(String[] args) {
		String s = "public static void main(String[] args)";
		StringTokenizer st = new StringTokenizer(s, " ");
		
		int tokenCnt = 0;
		while(st.hasMoreTokens()) {
			tokenCnt++;
			String word = st.nextToken();
			System.out.println(word);
		}
		System.out.println("총 토큰의 갯수는 " + tokenCnt + "개입니다");
	}

}
