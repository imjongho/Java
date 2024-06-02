package Mentoring2_3;

public class Main {

	public static void main(String[] args) {
		
		Circle circle = new Circle(5.0);
		System.out.println("Circle:");
		System.out.println("Area: " + circle.calculateArea());
		circle.resize(2.0);
		System.out.println("Resized Circle:");
		System.out.println("Area: " + circle.calculateArea());
		
		System.out.println();
		
		Rectangle rectangle = new Rectangle(3.0, 4.0);
		System.out.println("Rectangle:");
		System.out.println("Area: " + rectangle.calculateArea());
		rectangle.resize(1.5);
		System.out.println("Resized Rectangle:");
		System.out.println("Area: " + rectangle.calculateArea());
		
		System.out.println();
		
		Triangle triangle = new Triangle(4.0, 6.0);
		System.out.println("Triangle:");
		System.out.println("Area: " + triangle.calculateArea());
		triangle.resize(0.8);
		System.out.println("Resized Triangle:");
		System.out.println("Area: " + triangle.calculateArea());
		
	}

}
