package Project3_Quadrangle;

//직사각형 : 넓이 = 밑변 * 높이(사각형과 동일)
public class Rectangle extends Quadrangle {		// 상속 관계
	
	public Rectangle(int height, int down_side, String name) {
		super(height, down_side, name);		// 부모 생성자 호출
	}

}
