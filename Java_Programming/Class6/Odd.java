package Class6;

public class Odd {
	
	// 1~n까지의 홀수의 합을 구하는 함수(메소드)
	int odd_sum(int num) {
		
		int odd_sum = 0;
		for(int i = 1; i <= num; i++) {
			if(i % 2 != 0) {	// 홀수
				odd_sum += i;
			}
		}
		
		return odd_sum;
	}
	
	
	
	
	
}
