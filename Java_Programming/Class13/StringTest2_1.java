package Class13;
import java.util.Scanner;

public class StringTest2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		
		int size = str.length();
		char arr[] = new char[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		
		char first = arr[0];
		while(true) {
			
			char temp = arr[0];
			for(int i = 0; i < arr.length-1; i++) {
				arr[i] = arr[i+1];	// 한칸씩 앞으로
			}
			arr[arr.length-1] = temp;
			
			for(char c : arr) {
				System.out.print(c);
			}
			System.out.println();
			
			// 다시 돌아온 문자가 처음에 저장한 문자와 같다면 그만
			if(arr[0] == first) {
				break;
			}
			
		}
		
		sc.close();
	}

}
