package Project3_ex1;

public class Professor extends Person {
	
	private int salary;
	private String email;
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Professor(String name, int age, int salary, String email) {
		super.setAge(age);
		super.setName(name);
		
		this.salary = salary;
		this.email = email;
	}
	
	public void show() {
		System.out.println("----------------------------");
		
		System.out.println("교수님 이름 : " + super.getName());
		System.out.println("교수님 나이 : " + super.getAge());
		System.out.println("교수님 월급 : " + getSalary());
		System.out.println("교수님 이메일 : " + getEmail());
	}
	
}
