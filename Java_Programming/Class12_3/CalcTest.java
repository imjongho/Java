package Class12_3;
import java.util.Scanner;

class Sum extends Calc {
	@Override
	public int calculate() {
		return a+b;
	}
}

class Sub extends Calc {
	@Override
	public int calculate() {
		return a-b;
	}
}

class Mul extends Calc {
	@Override
	public int calculate() {
		return a*b;
	}
}

class Div extends Calc {
	@Override
	public int calculate() {
		if(b == 0) {
			return -1;
		}
		return a/b;
	}
}


public class CalcTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calc calc = null;
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char c = sc.next().charAt(0);
		
		switch(c) {
			case '+':
				calc = new Sum();
				break;
			case '-':
				calc = new Sub();
				break;
			case '*':
				calc = new Mul();
				break;
			case '/':
				calc = new Div();
				break;
			default:
				System.out.println("잘못 입력");					
		}
		
		calc.setValue(a, b);
		int result = calc.calculate();
		System.out.println(result);
		
		sc.close();
	}

}
























