package Mentoring1;
import java.util.Scanner;
import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int num[] = new int[10];	// 각 자리수 넣을 배열
		int cnt = 0;	// 자리수(일의 자리부터)
		
		while(N != 0) {
			num[cnt] = N % 10;
			N = N / 10;
			cnt++;
		}
		
		// 오름차순 정렬(버블 정렬)
		/*
		for(int i = 0; i < cnt; i++) {
			for(int j = 0; j < num.length - i - 1; j++) {
				if(num[j] > num[j+1]) {
					int temp = num[j+1];
					num[j+1] = num[j];
					num[j] = temp;
				}
			}
		}
		*/
		Arrays.sort(num);
		
		// 출력 내림차순
		for(int i = num.length - 1; i >= num.length - cnt; i--) {
			System.out.print(num[i]);
		}
		
		sc.close();
	}
	
}



