package Class6;

public class OddEven extends Odd {
	
	// 1~n까지의 짝수의 합을 구하는 함수(메소드)
	int even_sum(int num) {
		
		int even_sum = 0;
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0) {	// 짝수
				even_sum += i;
			}
		}
		
		return even_sum;
	}
	
}
