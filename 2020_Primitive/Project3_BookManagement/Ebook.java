package Project3_BookManagement;

public class Ebook extends Book {
	
	private String security_key;	// 보안키
	
	public Ebook(String title, String writer, int price, String security_key) {
		super(title, writer, price);
		this.security_key = security_key;
	}
	
	@Override
	public void show() {
		System.out.println("--------------------------");
		System.out.println("제목 : " + super.getTitle());
		System.out.println("저자 : " + super.getWriter());
		System.out.println("가격 : " + super.getPrice());
		System.out.println("보안키 : " + getSecurity_key());
		System.out.println("--------------------------");
	}
	
	
	// ---------------- 접근자, 설정자-----------------
	
	public String getSecurity_key() {
		return security_key;
	}

	public void setSecurity_key(String security_key) {
		this.security_key = security_key;
	}
	
}
