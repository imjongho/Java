package interface_ex;

public abstract class Animal {
	
	String name;
	int age;
	
	// 부모 생성자
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract void crying();	// 추상 메소드
	
}

