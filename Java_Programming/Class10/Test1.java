package Class10;
import java.util.Scanner;

public class Test1 {
	
	public static int max(int num1, int num2) {
		int max = 0;
		if(num1 >= num2) {
			max = num1;
		}
		else {
			max = num2;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("두 개의 수를 입력받아 큰 수를 출력하는 프로그램");
		System.out.print("num1 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 : ");
		int num2 = sc.nextInt();
		*/
		
		System.out.println("매개변수로 받은 두 수의 합은 : " + (args[0] + args[1]));
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.print("두 수 중 큰 값은(" + num1 + ", " + num2 + ") : " + max(num1, num2));
		
		sc.close();
	}

}
