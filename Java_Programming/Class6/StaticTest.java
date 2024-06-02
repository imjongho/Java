package Class6;

class Static {
	
	public int a = 20;
	private int b = 5;
	static int c;

}


public class StaticTest {

	public static void main(String[] args) {
		int a = 10;
		Static.c = a;
		Static st = new Static();
		System.out.println("클래스 변수 : " + (Static.c)++ );	// 클래스 명으로 접근 
		System.out.println("클래스변수 : " + st.c);
		System.out.println("변수 a : " + a );	// 메소드 내의 변수 a
		System.out.println("변수 a : " + st.a );	// 객체참조변수 a
	}

}
