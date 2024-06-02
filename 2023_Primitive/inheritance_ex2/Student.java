package inheritance_ex2;

public class Student extends Person {
	
	private String Place;	// 학교
	private double Grade;	// 점수
	
	// 학교에 대한 필드값을 얻는 함수
	public String getPlace() {
		return Place;
	}
	// 학교에 대한 필드값을 설정하는 함수
	public void setPlace(String place) {
		Place = place;
	}
	// 성적에 대한 필드값을 얻는 함수
	public double getGrade() {
		return Grade;
	}
	// 성적에 대한 필드값을 설정하는 함수
	public void setGrade(double grade) {
		Grade = grade;
	}

	// 생성자
	public Student(String name, int age, String place, double grade){
		super(name, age);	// 매개변수 전달
		// 반드시 super()는 자식클래스 생성자 첫 줄에 사용
		Place = place;
		Grade = grade;
		// 학교와 성적은 학생의 개인 속성이기 때문에 따로 뺌 
	}
	
	// 정보를 출력하는 함수
	public void show() {
		System.out.println("학생 이름 : " + super.getName());
		System.out.println("학생 나이 : " + super.age);	// super.변수명
		System.out.println("학교 이름 : " + getPlace());
		System.out.println("학생 성적 : " + getGrade());
	}
	
}

