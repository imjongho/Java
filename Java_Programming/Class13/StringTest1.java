package Class13;
import java.util.Scanner;

public class StringTest1 {
	
	static String arr[] = new String[5];
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==사용자 입력 데이터==");
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.next();
		}
		
		System.out.println("==정렬후 데이터==");
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");
		}
		
		
		sc.close();
	}
	
	
}
