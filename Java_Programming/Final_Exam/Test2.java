package Final_Exam;
import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Array length : ");
		int size = sc.nextInt();	// 배열의 크기 입력 받음
		// 크기가 같은 두 개의 1차원 배열
		int arr1[] = new int[size];
		int arr2[] = new int[size];
		
		// 배열의 원소는 0~7의 값 랜덤
		for(int i = 0; i < size; i++) {
			arr1[i] = (int)(Math.random() * 8);	// 0~7
			arr2[i] = (int)(Math.random() * 8);	// 0~7
		}
		
		// 출력
		System.out.print("Array 1:  ");
		for(int i = 0; i < size; i++) {
			System.out.print(arr1[i] + "  ");
		}
		System.out.println();
				
		System.out.print("Array 2:  ");
		for(int i = 0; i < size; i++) {
			System.out.print(arr2[i] + "  ");
		}
		
				
		// 계산
		// 누적된 값이 최재이려면 정렬 후 큰 값 끼리 곱해야 함
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean[] check_arr1 = new boolean[size];
		boolean[] check_arr2 = new boolean[size];
		for(int i = 0; i < size; i++) {	// 초기화
			check_arr1[i] = false;
			check_arr2[i] = false;
		}
		
		int result = 0;
		for(int i = 0; i < size; i++) {	// 중복 제거 // 배열의 길이만큼 반복
			if(check_arr1[i] == false && check_arr2[i] == false) {
				check_arr1[i] = true;
				check_arr2[i] = true;
				// 두 수를 곱한 값을 누적하여 더함
				result = result + (arr1[i] * arr2[i]);
			}
		}
		
		System.out.println();
		System.out.println("결과 : " + result);	
		sc. close();
		
	}

}
