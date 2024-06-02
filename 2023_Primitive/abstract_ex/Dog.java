package abstract_ex;

public class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void crying() {
		System.out.println("강아지 : 멍~! 멍~!");
	}
}
