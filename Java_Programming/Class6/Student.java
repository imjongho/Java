package Class6;

public class Student {
	String name;
	private String student_id;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getStudentId() {
		return student_id;
	}
	
	public void setStudentId(String student_id) {
		this.student_id = student_id;
	}
	
}