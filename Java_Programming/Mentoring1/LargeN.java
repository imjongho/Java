package Mentoring1;
import java.util.Scanner;

public class LargeN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = 10;
		int n = sc.nextInt();
		
		int[] arr = new int[size];
		int[] results = new int[n];
		
		for(int c = 0; c < n; c++) {	// N
			
			for(int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			
			// 오름차순 정렬(버블 정렬) 후 뒤에서 3번째
			boolean flag;
			for(int i = 0; i < size; i++) {
				flag = true;
				for(int j = 0; j < size - 1 - i; j++) {
					if(arr[j] > arr[j+1]) {
						int temp = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = temp;
						flag = false;	// 교환이 있으면 flag 0
					}
				}
				
				if(flag == true) {	// 교환이 없으면 flag 1 종료
					break;
				}
			}
			
			results[c] = arr[size-3];
		}
		
		for(int c = 0; c < n; c++) {
			System.out.println(results[c]);
		}
		
		sc.close();
	}

}
