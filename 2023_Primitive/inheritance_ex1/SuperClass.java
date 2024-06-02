package inheritance_ex1;

// 부모 클래스
public class SuperClass {
	
	// 생성자란? 클래스 이름과 동일해야 하고 객체의 초기화를 위해 실행되는 메소드이다.
	// 생성자는 리턴값이 없고 모든 클래스에는 반드시 하나 이상의 생성자가 정의되어 있어야 한다.
	
	// 부모클래스 생성자
	public SuperClass() {
		System.out.println("부모 생성자를 호출합니다.");
	}
	
	// 부모클래스 메소드
	public void super_show() {
		System.out.println("부모 클래스의 메소드를 호출합니다.");
	}

}



