package abstract_ex;

// 추상클래스 Animal
// 동물의 공통적인 속성과 기능을 정의한 클래스
public abstract class Animal {
	
	String name;	// 동물 이름
	
	// 부모생성자
	public Animal(String name) {
		this.name = name;
	}
	
	// 동물의 이름을 보여주는 메소드
	public void name_show() {
		System.out.println("이름은 " + name);
	}
	
	// 추상 메소드 : 선언 부분만 있고 구현 부분이 없는 메소드 
	// 상속받는 클래스는 반드시 오버라이딩 해야 한다.
	// 동물의 공통적인 속성인 울음소리를 정의한 추상메소드
	public abstract void crying();		
	
	// 동물의 특징, 동물의 습성 등의 공통적인 기능을 미리 정의 가능
}

