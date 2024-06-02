package Class2;
import java.util.Scanner;

public class Class2_Test3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		double temp;
		double temp_change;
		
		System.out.println("==========================");	
		System.out.println("1. 화씨->섭씨");
		System.out.println("2. 섭씨->화씨");
		System.out.println("==========================");
		
		System.out.print("번호를 선택하시오 : ");
		num = sc.nextInt();
		System.out.print("온도를 입력하시오 : ");
		temp = sc.nextDouble();
		

		if(num == 1) {
			temp_change = 5.0/9 * (temp - 32);
			System.out.println("변화된 온도는 " + temp_change);
		} else if(num == 2) {
			temp_change = (temp * 9.0/5) + 32;
			System.out.println("변화된 온도는 " + temp_change);
		}
		
		
	}

}
