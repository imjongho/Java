package Exception;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[3];
		
		for(int i = 0; i < 5; i++) {	
			try {
				System.out.print("intArray[" + i + "]=");
				int num = sc.nextInt();
				arr[i] = num;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index is out of bounds");
			}
		}
		
		
		sc.close();
	}

}
