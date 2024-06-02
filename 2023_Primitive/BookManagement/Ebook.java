package BookManagement;

public class Ebook extends Book {
	
	private String securityKey;
	
	Ebook(String title, String author, int price, String securityKey) {
		// 생성자를 통해서 초기화, super사용
		super(title, author, price);
		this.securityKey = securityKey;
	}

	
	@Override
	public void show() {
		super.show();
		System.out.println("보안키 : " + securityKey);
	}
	
	
	

	public String getSecurityKey() {
		return securityKey;
	}

	public void setSecurityKey(String securityKey) {
		this.securityKey = securityKey;
	}

	
}
