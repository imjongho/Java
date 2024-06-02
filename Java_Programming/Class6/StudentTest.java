package Class6;
import java.util.*;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 이름 : ");
		String name = sc.next();
		System.out.print("학생의 학번 : ");
		String student_id = sc.next();
		System.out.print("학생의 나이 : ");
		int age = sc.nextInt();
		
		Student obj = new Student(name, age);
		obj.setStudentId(student_id);
		System.out.println("name = " + obj.name + " rollno = " + obj.getStudentId() + " age = " + obj.age);
		
		sc.close();
	}

}
