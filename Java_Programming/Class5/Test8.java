package Class5;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int student[][] = { 
						{1, 3, 2, 4, 3, 1, 4, 2, 2, 1}, 
						{3, 2, 4, 2, 2, 1, 1, 3, 4, 1}, 
						{2, 4, 3, 2, 1, 2, 1, 3, 3, 4},
						{2, 3, 3, 1, 1, 3, 2, 2, 4, 4},
						{3, 1, 1, 2, 4, 1, 2, 3, 1, 3} 
						};
		
		int[] answer = new int[10];
		
		System.out.print("정답을 입력하세요(10개) : ");
		for(int i = 0; i < 10; i++) {
			answer[i] = sc.nextInt();
		}
		
		int cnt = 0;	// 정답 수
		for(int i = 0; i < student.length; i++) {
			for(int j = 0; j < student[i].length; j++) {
				if(answer[j] == student[i][j]) {
					cnt++;
				}
			}
			System.out.println("학생" + (i+1) + "의 점수 : " + cnt + "점");
			cnt = 0;
		}
		
		
	}

}
