package Project3_Quadrangle;

public class Quadrangle {	// 사각형
	
	private int height;		// 높이
	private int down_side;	// 밑변
	private int area;		// 넓이(조건이 int..?)
	private String name; 	// 이름
	
	public Quadrangle(int height, int down_side, String name) {		// 생성자
		this.height = height;
		this.down_side = down_side;
		this.name = name;
		Area();
	}
	
	public void show() {
		System.out.println("-------------------------");
		System.out.println(name + "  넓이 : " + area);
	}
	
	public void Area() {	// 오버라이딩
		area = height * down_side;
	}
	
	
	// -------------- 접근자, 설정자 ---------------- 
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDown_side() {
		return down_side;
	}

	public void setDown_side(int down_side) {
		this.down_side = down_side;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
