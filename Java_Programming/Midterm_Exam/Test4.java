package Midterm_Exam;
import java.util.Arrays;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기 입력 : ");
		int size = sc.nextInt();
		int arr1[] = new int[size];
		int arr2[] = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr1[i] = (int)(Math.random() * 8);	// 0~7
			arr2[i] = (int)(Math.random() * 8);	// 0~7
		}
		

		// 출력
		System.out.print("Array 1 : ");
		for(int i = 0; i < size; i++) {
			System.out.print(arr1[i] + "  ");
		}
		System.out.println();
		
		System.out.print("Array 2 : ");
		for(int i = 0; i < size; i++) {
			System.out.print(arr2[i] + "  ");
		}
		
		
		// 추가: 정렬 후 계산
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int result = 0;
		for(int i = 0; i < arr1.length; i++) {
			result = result + (arr1[i] * arr2[arr1.length-i-1]);
		}
		
		System.out.println();
		System.out.print("결과 : " + result);
		
		sc.close();
	}

}
