package Project3_ex5;

public abstract class Animal {		// 추상화
	
	String name;
	int age;
	
	Animal(String name, int age){	// 생성자
		this.name = name;
		this.age = age;
	}
	
	public abstract void crying();	// 울음소리
	public abstract void feature(); // 특징
	
}
