package Mentoring2_3;

public class Circle extends AbstractShape {
	
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
		area = radius * radius * Math.PI;
	}
	
	// 조건: resize 메소드를 각 도형 클래스에서 구현
	@Override
	public void resize(double sizeRate) {
		radius *= sizeRate;
		area = radius * radius * Math.PI;
	}
	
}
