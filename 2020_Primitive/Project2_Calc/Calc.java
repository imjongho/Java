package Project2_Calc;

import java.util.*;

public class Calc {
	
	Scanner sc = new Scanner(System.in);
	
	public Calc() {
		System.out.println("사칙 연산 계산기");

		int num1 = sc.nextInt();
		String operator = sc.next();
		int num2 = sc.nextInt();
		
		switch(operator) {
		case "+":
			System.out.println(plus(num1, num2, operator));
			break;	
		case "-":
			System.out.println(minus(num1, num2, operator));
			break;
		case "*":
			System.out.println(multiple(num1, num2, operator));
			break;
		case "/":
			System.out.println(division(num1, num2, operator));
			break;
		default:
			System.out.println("잘못된 입력");
			break;
		}
		
	}
	
	public String plus(int num1, int num2, String operator) {
		int result = num1 + num2;
		String form = num1 + " " + operator + " " + num2 + " = " + result;
		return form;
	}
	
	public String minus(int num1, int num2, String operator) {
		int result = num1 - num2;
		String form = num1 + " " + operator + " " + num2 + " = " + result;
		return form;
	}
	
	public String multiple(int num1, int num2, String operator) {
		int result = num1 * num2;
		String form = num1 + " " + operator + " " + num2 + " = " + result;
		return form;
	}
	
	public String division(int num1, int num2, String operator) {
		
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.exit(0);		// 강제 종료
		}
		
		double result = (double)num1 / (double)num2;
		String form = num1 + " " + operator + " " + num2 + " = " + result;
		return form;	
	}
	
}
