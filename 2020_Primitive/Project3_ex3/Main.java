package Project3_ex3;

import java.util.Scanner;

public class Main {		// 다형성

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("포도 : 1, 복숭아 : 2");
		int select = sc.nextInt();
		Fruit fruit;
		
		if(select == 1) {
			fruit = new Grape();
			fruit.show();
		}
		
		if(select == 2) {
			fruit = new Peach();
			fruit.show();
		}
		
	}

}
