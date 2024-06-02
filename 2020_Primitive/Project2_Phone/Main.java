package Project2_Phone;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("기종 입력 : ");
		String model_1 = sc.next();
		System.out.print("기종 입력 : ");
		String model_2 = sc.next();
		
		Phone ph1 = new Phone(model_1);		// 인스턴스화
		Phone ph2 = new Phone(model_2);		
		
		if(ph1.getBat() <= 20) {
			System.out.println(ph1.model + "배터리 전원 부족");
		}
		
		if(ph2.getBat() <= 20) {
			System.out.println(ph2.model + "배터리 전원 부족");
		}
	}

}
