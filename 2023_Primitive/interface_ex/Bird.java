package interface_ex;

public class Bird extends Animal implements Flyable, Jumpable {
	
	// 인터페이스의 추상 메소드 구현
	@Override
	public void fly() {
		System.out.println(super.name + "가 난다");
	}
	
	// 인터페이스의 추상 메소드 구현
	@Override
	public void jump() {
		System.out.println(super.name + "가 점프한다");
	}
	
	// 추상클래스 Animal의 추상 메소드 구현
	@Override
	public void crying() {
		System.out.println("짹~ 짹~!");
	}
	
	
	// 자식 생성자
	public Bird(String name, int age) {
		super(name, age);
	}
	
	// 정보를 출력하는 함수
	public void show_info() {
		System.out.println("이름은 " + super.name + " 나이는 " + super.age + "살");
	}
	
}

