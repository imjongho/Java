package Class5;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double sum = 0.0, avg = 0.0;
		double[] score = new double[4];
		int cnt = 0;
		
		for(int i = 0; i < score.length; i++) {
			System.out.print("성적을 입력하세요 : ");
			score[i] = sc.nextInt();

			if(score[i] == -1) {
				break;
			}
			
			cnt++;
			sum = sum + score[i];
		}
		
		System.out.println("합계 : " + sum);
		avg = sum / cnt;
		System.out.println("평균 : " + avg);
	}

}
