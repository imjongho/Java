package Class6;

class Person {
	String name;
	private String mobile;
	private String office;
	private String email;
	
	Person(String name, String mobile, String office, String email){
		this.name = name;
		this.mobile = mobile;
		this.office = office;
		this.email = email;
	}
	
	public String toString() {
		return "Person [name=" + name + ", mobile=" + mobile + ", office=" + office + ", email=" + email + "]";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getOffice() {
		return office;
	}
	
	public void setOffice(String office) {
		this.office = office;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}


public class PersonTest {

	public static void main(String[] args) {
		Person obj = new Person("Kim", "01010233502", "031124245", "aasf@gmail.com");
		System.out.println(obj);
		
		System.out.println("name=" + obj.name + ", mobile=" + obj.getMobile() + ", office=" + obj.getOffice() + ", email=" + obj.getEmail());
		
		obj.setName("Park");
		obj.setMobile("01089898989");
		obj.setOffice("041124515");
		obj.setEmail("las@naver.com");
		System.out.println(obj);
		
		Person obj2 = obj;
		System.out.println(obj2);
	}

}
