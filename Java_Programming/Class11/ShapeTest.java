package Class11;

class Shape {
	
	// 도형 넓이 계산
	void getArea() {
		
	}
}

class Rectangle extends Shape {

	double length;
	double width;
	
	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	void getArea() {
		System.out.println(length * width);
	}
	
}

class Circle extends Shape {
	double radius;
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	void getArea() {
		System.out.println(radius * radius * 3.14);
	}
}


public class ShapeTest {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(5, 2.5);
		r.getArea();
		
		Circle c = new Circle(3);
		c.getArea();
	}

}




