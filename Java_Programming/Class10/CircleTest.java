package Class10;

class Circle {
	
	private int x;
	private int y;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void move(Circle c, int dx, int dy) {
		c.x += dx;
		c.y += dy;
	}
	
	
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}
	
}


public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle(10, 10, 5);
		System.out.println("move() 호출 전");
		System.out.println(c1);
		c1.move(c1, 30, 20);
		
		System.out.println("move() 호출 후");
		System.out.println(c1);
		
		
		System.out.println("-------------------------------");
		System.out.println("다음 연습문제");
		
		
		Circle[] circle = new Circle[3];	// 크기가 3인 Circle 객체 생성
		circle[0] = new Circle(95, 80, 30);
		circle[1] = new Circle(95, 80, 30);
		circle[2] = new Circle(95, 80, 30);
		
		for(int i = 0; i < 3; i++) {
			int x = (int)(Math.random() * 100);	// 0~99
			int y = (int)(Math.random() * 100);
			int radius = (int)(Math.random() * 100);
			
			circle[i] = new Circle(x, y, radius);
			System.out.println(circle[i]);
		}
		
	}

}
