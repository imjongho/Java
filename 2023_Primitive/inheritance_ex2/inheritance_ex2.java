package inheritance_ex2;

public class inheritance_ex2 {
	
	// this, super는 static아 붙은 메소드에서는 사용 불가
	public static void main(String[] args) {
		
		Professor prf = new Professor("홍길동", 55, 10000000, "qwer@naver.com");
		Student std = new Student("임종호", 23, "공주대", 3.5);
		
		prf.show();
		System.out.println("-------------------------------");
		std.show();
		
	}

}

