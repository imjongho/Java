package inheritance_ex1;

public class Inheritance_ex1 {

	public static void main(String[] args) {
		SubClass sub = new SubClass();	
		// 자식클래스로 인스턴스 생성시
		// 부모클래스 생성자가 먼저 호출되고 다음으로 자식클래스의 생성자가 호출됨
		// 기본 생성자만 자동으로 호출됨
		
		sub.sub_show();		// 자식클래스의 메소드 호출
		
		sub.super_show();	// 부모클래스의 메소드 호출
		// 부모클래스의 메소드를 상속했음을 보여준다.
		
		// 객체란? 모든 인스턴스를 대표하는 포괄적인 의미
		// 인스턴스란? 어떤 클래스로부터 만드어진 것인지를 강조하는 보다 구체적인 의미
	}

}

