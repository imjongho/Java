package inheritance_ex4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사과 : 1, 포도 : 2");
		int choice = sc.nextInt();
		
		// Fruit 타입의 fruit라는 참조변수를 선언함
		// 이는 Fruit클래스의 멤버만 사용 가능하고
		// 다른(예 Apple)클래스에 선언된 멤버는 상속된 멤버를 제외하고는 사용할 수 없다.
		Fruit fruit;	
		
		if(choice == 1) {
			// fruit라는 참조변수가 클래스 Apple의 인스턴스가 있는 주소값을 가진다.
			fruit = new Apple();	
			fruit.show();	// 부모클래스의 show메소드 호출
		}
		
		if(choice == 2) {
			// fruit라는 참조변수가 클래스 Grape의 인스턴스를 참조한다.
			fruit = new Grape();
			fruit.show();
		}
		
		Fruit fruit2 = new Fruit();
		fruit2.show();
		Fruit fruit3 = new Apple();
		fruit3.show();
		
	} 

}


