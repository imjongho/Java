package abstract_ex;

public class Cat extends Animal {
	
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void crying() {
		System.out.println("고양이 : 야옹~! 야옹~!");
	}
	
}
