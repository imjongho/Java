package Project3_ex5;

public class Dog extends Animal implements ShowInfo {
	
	String cry;		// 울음 소리
	String ft;		// 특징
	
	Dog(String name, int age){		// 생성자
		super(name, age);
	}
	
	@Override
	public void crying() {
		System.out.println("월~! 월~!");
	}
	
	@Override
	public void feature() {
		System.out.println(super.name + "는 귀엽습니다.");
	}
	
	@Override
	public void show() {
		System.out.println("이름 : " + super.name);
		System.out.println("나이 : " + super.age + "살");
	}
}
