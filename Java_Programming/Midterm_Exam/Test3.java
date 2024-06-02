package Midterm_Exam;
import java.util.Scanner;
import java.util.ArrayList;

class Contact {
	
	private String name;
	private String phone_number;
	private String email;
	static int member_num = 0; 
	
	// 생성자
	public Contact(String name, String phone_number, String email) {
		this.name = name;
		this.phone_number = phone_number;
		this.email = email;
		member_num++;
	}
	
	public String toString() {
		return name + "\t전화번호 : " + phone_number + "\t이메일 : " + email;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}


public class Test3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Contact> list = new ArrayList<Contact>();
		
		String name[] = new String[100]; 
		String phone_number[] = new String[100]; 
		String email[] = new String[100];
		
		System.out.println("연락처를 입력하시오(종료: exit)");
		for(int i = 0; i < 100; i++) {	// 최대 입력 100
			System.out.print("이름과 전화번호, 이메일을 입력하시오 : ");
			name[i] = sc.next();
			if(name[i].equals("exit")) {
				break;
			}
			else {
				phone_number[i] = sc.next();
				email[i] = sc.next();
				list.add(new Contact(name[i], phone_number[i], email[i]));
			}
		}
		
		System.out.println("지인들의 수는 " + Contact.member_num + "입니다");
		
		for(int i = 0; i < 100; i++) {
			System.out.print("검색할 이름을 입력하시오(종료: exit) : ");
			String input_name = sc.next();
			if(input_name.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			
			for(Contact x : list) {
				if(x.getName().equals(input_name)) {
					System.out.println(x);
				}
			}
		}
		
		
		sc.close();

	}

}
