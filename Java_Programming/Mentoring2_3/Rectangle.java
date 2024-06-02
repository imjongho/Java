package Mentoring2_3;

public class Rectangle extends AbstractShape {
	
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		area = width * height;
	}
	
	@Override
	public void resize(double sizeRate) {
		width *= sizeRate;
		height *= sizeRate;
		area = width * height;
	}

}
