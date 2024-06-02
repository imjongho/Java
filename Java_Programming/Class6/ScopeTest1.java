package Class6;

public class ScopeTest1 {
	public int radius = 20;
	private int a = 5;
	private double PI = 3.14159;
	
	public void sum(int x, int y){
		int sum = x + y;
	}
	
	public void sub(int x, int y) {
		int sub = x - y;
	}
	
	public void area() {
		double area = a * a * PI;
	}
}
