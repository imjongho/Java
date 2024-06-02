package Project3_ex1;

public class Student extends Person {
	
	private String StudentID;
	private double Grade;
	
	public String getStudentID() {
		return StudentID;
	}
	
	public void setStudentID(String studentID) {
		StudentID = studentID;
	}
	
	public double getGrade() {
		return Grade;
	}
	
	public void setGrade(double grade) {
		Grade = grade;
	}
	
	public Student(String name, int age, String studentID, double grade) {
		super(name, age);
		StudentID = studentID;
		Grade = grade;
	}
	
	public void show() {
		System.out.println("----------------------------");
		
		System.out.println("학생 이름 : " + super.getName());
		System.out.println("학생 나이 : " + super.getAge());
		System.out.println("학생 학번 : " + getStudentID());
		System.out.println("학생 성적 : " + getGrade());
	}
	
}
