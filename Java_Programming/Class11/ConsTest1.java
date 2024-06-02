package Class11;

class Hello {
	
	String title;
	int value;
	
	public Hello() {
		title += "World";
	}
	
	public Hello(int value) {
		// Hello();
		this.value = value;
		title += "Hello";
	}
	
}



public class ConsTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello c = new Hello(5);
		System.out.println(c.title);
	}

}
