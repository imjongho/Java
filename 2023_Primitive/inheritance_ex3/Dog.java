package inheritance_ex3;

public class Dog extends Animal {
	
	@Override
	public void crying() {
		super.crying();
		System.out.println("개 울음소리 : 멍~! 멍~!");
	}
	
}

