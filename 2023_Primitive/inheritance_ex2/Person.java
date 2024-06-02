package inheritance_ex2;

public class Person {
	
	// private 멤버는 상속 X
	// 하지만, public, protected 메서드를 이용하여 private 필드에 접근 가능
	// 예시: getName, setName
	private String name;
	public int age;
	
	public String getName() {
		return name;
	}
	
	protected void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// 매개변수가 없는 기본 생성자
	// super를 사용하여 따로 생성자를 호출하지 않으면 부모클래스에서 기본 생성자가 호출됨
	// 기본 생성자가 없을시 에러 발생
	public Person() {
		
	}
	
	// 매개변수가 있는 생성자 -> 자동으로 호출 X
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}

