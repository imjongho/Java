package Mentoring2_3;

public class Triangle extends AbstractShape {
	
	double base;
	double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
		area = (base * height) / 2;
	}
	
	@Override
	public void resize(double sizeRate) {
		base *= sizeRate;
		height *= sizeRate;
		area = (base * height) / 2;
	}

}
