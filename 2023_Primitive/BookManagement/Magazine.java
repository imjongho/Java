package BookManagement;

public class Magazine extends Book {
	
	private String publishDate;
	
	Magazine(String title, String author, int price, String publishDate) {
		super(title, author, price);
		this.publishDate = publishDate;
	}

	
	@Override
	public void show() {
		super.show();
		System.out.println("발행일 : " + publishDate);
	}
	

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

}
