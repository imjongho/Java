package inheritance_ex2;

public class Professor extends Person {

	private int salary;		// 월급
	private String email;	// 이메일 
	
	// 월급에 대한 필드값을 얻는 함수
	public int getSalary() {
		return salary;
	}
	// 월급에 대한 필드값을 설정하는 함수
	public void setSalary(int salary) {
		this.salary = salary;	// 변수 이름을 같게 설정하면 this 사용
	}
	// 이메일에 대한 필드값을 얻는 함수
	public String getEmail() {
		return email;
	}
	// 이메일에 대한 필드값을 설정하는 함수
	public void setEmail(String email) {
		this.email = email;		
	}
	
	
	// 생성자
	public Professor(String name, int age, int salary, String email) {
		super.setAge(age);		// super.메서드();
		super.setName(name);
		
		this.salary = salary;
		this.email = email;
	}
	
	// 정보를 출력하는 함수
		public void show() {
			System.out.println("교수님 성함 : " + super.getName());
			System.out.println("교수님 연세 : " + super.getAge());
			System.out.println("교수님 월급 : " + getSalary());
			System.out.println("교수님 이메일 : " + getEmail());
		}
		
}
