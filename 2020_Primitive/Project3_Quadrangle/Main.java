package Project3_Quadrangle;

public class Main {

	public static void main(String[] args) {
		
		Quadrangle qr = new Quadrangle(3, 5, "사각형");		// 매개변수 : 높이, 밑변, 이름
		Rectangle rt = new Rectangle(8, 3, "직사각형");		// 매개변수 : 높이, 밑변, 이름
		Square sq = new Square(6, "정사각형");				// 매개변수 : 변, 이름
		Trapezoid tz = new Trapezoid(3, 4, 7, "사다리꼴");	// 매개변수 : 윗변, 밑변, 높이, 이름
		
		qr.show();	// 클래스명.상위 클래스 메소드 호출은 가능
		rt.show();	// 단, 클래스명.하위클래스 메소드 호출은 불가능
		sq.show();
		tz.show();
	}

}
