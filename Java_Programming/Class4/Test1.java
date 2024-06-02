package Class4;

public class Test1 {

	public static void main(String[] args) {
		
		int num = 100;
		System.out.print("2부터 100사이 모든 소수 : ");
		
		for(int i = 2; i <= num; i++) {
			
			int count = 0;	// count 초기화
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {	
					count += 1;
				}
			}
			
			if(count == 2) {
				System.out.print(i + " ");
			}
		}
	
	}
		
}
