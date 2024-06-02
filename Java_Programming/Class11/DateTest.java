package Class11;

class Date {
	
	private int year;
	private int month;
	private int day;
	
	Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	
	public String toString() {
		return "[" + year + "-" + month + "-" + day + "]";
	}
	
}

class Employee {
	private String name;
	private Date birthday;
	
	Employee(String name, Date birthday) {
		this.name = name;
		this.birthday = birthday;	// birthday = new Date(2001, 9, 1);
	}
	
	public String toString() {
		return name + ", 생일" + birthday;
	}
}



public class DateTest {
	
	public static void main(String[] args) {
		Date birth = new Date(2001, 9, 1);
		Employee employee = new Employee("임종호", birth);
		System.out.println(employee);
	}

}





