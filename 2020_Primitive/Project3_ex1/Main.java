package Project3_ex1;

public class Main {

	public static void main(String[] args) {	// 상속
		
		Student std = new Student("임종호", 20, "202001821", 4.5);
		Professor prf = new Professor("김철수", 55, 1000000, "qwe123@naver.com");
		
		std.show();
		prf.show();
	}

}
