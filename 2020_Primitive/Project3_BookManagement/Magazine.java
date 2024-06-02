package Project3_BookManagement;

public class Magazine extends Book {
	
	private String date_issue;	// 발행일
	
	public Magazine(String title, String writer, int price, String date_issue) {
		super(title, writer, price);
		this.date_issue = date_issue;
	}
	
	@Override
	public void show() {
		System.out.println("--------------------------");
		System.out.println("제목 : " + super.getTitle());
		System.out.println("저자 : " + super.getWriter());
		System.out.println("가격 : " + super.getPrice());
		System.out.println("발행일 : " + getDate_issue());
		System.out.println("--------------------------");
	}
	
	
	// ---------------- 접근자, 설정자-----------------
	
	public String getDate_issue() {
		return date_issue;
	}

	public void setDate_issue(String date_issue) {
		this.date_issue = date_issue;
	}
	
}
