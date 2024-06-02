package Class14;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();	// 0, 1로만 이루어진 문자열 s
		int len = s.length();
		
		int cnt[] = {0, 0};
		// '0'은 아스키 코드로 48
		cnt[s.charAt(0) - '0']++;
		
		for(int i = 1; i < len; i++) {
			if(s.charAt(i) != s.charAt(i-1)) {
				cnt[s.charAt(i) - '0']++;
			}
		}
		
		System.out.println("count[0]: " + cnt[0] + " count[1]: " + cnt[1]);
		System.err.println("result = " + Math.min(cnt[0], cnt[1]));
		
		sc.close();
	}

}
