package abstract_ex;

public class Main {

	public static void main(String[] args) {
		
		// Cannot instantiate the type Animal 
		// Animal 클래스는 인스턴스화할 수 없다. 왜? 추상클래스라서
		// Animal a = new Animal();
		Animal a = new Dog("종호");
		a.name_show();
		a.crying();
		
		Dog dog = new Dog("강아지우개"); 	// 자식 생성자 호출
		Cat cat = new Cat("고양아치");

		dog.name_show();	// 상속받은 부모 메소드 호출
		dog.crying();		// 오버라이딩된 하위클래스 메소드를 호출
		
		cat.name_show();
		cat.crying();
		

	}

}
