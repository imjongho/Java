package inheritance_ex1;

// 자식클래스(부모클래스를 상속)
public class SubClass extends SuperClass {		
	
	// 자식 기본 생성자
	public SubClass() {
		System.out.println("자식 생성자를 호출합니다.");
	}
	
	// 자식 메소드
	public void sub_show() {
		System.out.println("자식 클래스의 메소드를 호출합니다.");
	}
	
}


