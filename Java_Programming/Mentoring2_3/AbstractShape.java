package Mentoring2_3;

//Shape 인터페이스는 도형의 기본 동작을 정의
interface Shape {
	// 각 도형의 넓이 계산하여 반환하는 메소드
	public abstract double calculateArea();
}

// 도형의 크기를 조정할 수 있는 기능을 정의
interface Resizable {
	// 크기 조정 비율을 인자로 받는 크기 조절 메소드
	public abstract void resize(double sizeRate);
}


public abstract class AbstractShape implements Shape, Resizable {
	
	// 조건: 넓이를 저장하는 인스턴스 변수를 가짐
	double area;
	
	// 조건: Shape 인터페이스의 메소드를 구현
	@Override
	public double calculateArea() {
		return area;
	}
	
}
