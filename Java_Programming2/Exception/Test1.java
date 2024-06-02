package Exception;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("Numerator : ");
			int numer = sc.nextInt();
			System.out.print("Denominator : ");
			int denom = sc.nextInt();
			
			try {
				int result = numer / denom;
				System.out.println("Ceil(" + numer + " / " + denom + ") = " + result);
				break;
			}catch(ArithmeticException e) {
				System.out.print("You cannot divide by zero. ");
				System.out.println("Please enter a valid input");
			}
		}
		
	
		sc.close();
	}

}
