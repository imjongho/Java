package inheritance_ex4;

public class Apple extends Fruit{
	
	String shape = "동글동글";
	
	public Apple() {
		name = "사과";
		price = 2500;
	}
	
	@Override
	public void show() {
		System.out.println("모양 : " + shape);
	}
}

