package Class5;

public class Test10 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][5];
		
		for(int i = 0; i < arr.length; i++) {	// 0으로 초기화
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 0;
			}
		}
		
		
		int cnt;
		do
		{
			cnt = 0;
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 5; j++) {
					arr[i][j] = (int)(Math.random() * 2);	// 0~1
					if(arr[i][j] == 1) {
						cnt++;
					}
				}
			}
			
		}while(cnt != 5);


		for(int i = 0; i < 3; i++) {	// 출력
			for(int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
